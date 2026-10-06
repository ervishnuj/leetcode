class TimeNeededToBuyTickets:
    def timeRequiredToBuy(self, tickets: list[int], k: int) -> int:
        target=tickets[k];
        res=0;
        for i,ticket in enumerate(tickets): 
            if i<=k:
                res+=min(ticket,target);
            else:
                res+=min(ticket,target-1);
        return res;
