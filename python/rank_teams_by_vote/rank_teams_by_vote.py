from typing import List


def rankTeams(votes: List[str]) -> str:
    if len(votes) == 1:
        return votes[0]

    num_votes, num_teams = len(votes), len(votes[0])

    ranks = {team : [num_votes] * num_teams for team in votes[0]}
    for vote in votes:
        for pos, team in enumerate(vote):
            ranks[team][pos] -= 1
    
    return ''.join(sorted(ranks.keys(),
                            key=lambda team: (ranks[team], ord(team))))


votes = ["ABC","ACB","ABC","ACB","ACB"]
# votes = ["WXYZ","XYZW"]
# votes = ["ZMNAGUEDSJYLBOPHRQICWFXTVK"]


print(rankTeams(votes=votes))
