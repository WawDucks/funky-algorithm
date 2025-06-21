from collections import defaultdict
from typing import List


def findHighAccessEmployees(access_times: List[List[str]]) -> List[str]:
    employees_access = defaultdict(list)
    for access_time in access_times:
        a, b = access_time
        employees_access[a].append(int(b))
    
    high_access = []
    for employee, e_accesses in employees_access.items():
        e_accesses.sort()
        num_access = len(e_accesses)
        flag = False
        for i in range(num_access - 2):
            if e_accesses[i + 2] - e_accesses[i] < 100:
                high_access.append(employee)
                break
    return high_access


access_times = [["a","0549"],["b","0457"],["a","0532"],["a","0621"],["b","0540"]]
# access_times = [["d","0002"],["c","0808"],["c","0829"],["e","0215"],["d","1508"],["d","1444"],["d","1410"],["c","0809"]]
# access_times = [["cd","1025"],["ab","1025"],["cd","1046"],["cd","1055"],["ab","1124"],["ab","1120"]]
print(findHighAccessEmployees(access_times))