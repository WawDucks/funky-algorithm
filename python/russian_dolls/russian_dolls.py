from typing import List


def maxEnvelopes(envelopes: List[List[int]]) -> int:
    envelopes.sort(key=lambda x: (x[0], -x[1]))
    dp = [envelopes[0][1]] #[3,4,7]
    
    for _, h in envelopes[1:]:
        if h > dp[-1]:
            dp.append(h)
        else:
            l, r = 0, len(dp)
            while l < r:
                m = (l + r) // 2
                if dp[m] >= h:
                    r = m
                else:
                    l = m + 1
            dp[l] = h
    return len(dp)


envelopes = [[5,4],[6,4],[6,7],[2,3]]
# envelopes = [[1,1],[1,1],[1,1]]
print(maxEnvelopes(envelopes))