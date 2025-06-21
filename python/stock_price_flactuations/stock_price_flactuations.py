import heapq


class StockPrice:
    def __init__(self):
        self.stock_prices = {} # {timestamp: price}
        self.max_price = [] # [(price, timestamp)]
        self.min_price = [] # [(price, timestamp)]
        self.latest_timestamp = 0
    
    def update(self, timestamp: int, price: int) -> None:
        self.stock_prices[timestamp] = price
        self.latest_timestamp = max(self.latest_timestamp, timestamp)
        heapq.heappush(self.max_price, (-price, timestamp))
        heapq.heappush(self.min_price, (price, timestamp))
    
    def current(self) -> int:
        return self.stock_prices[self.latest_timestamp]
    
    def maximum(self) -> int:
        while -self.max_price[0][0] != self.stock_prices[self.max_price[0][1]]:
            heapq.heappop(self.max_price)
        return -self.max_price[0][0]
    
    def minimum(self) -> int:
        while self.min_price[0][0] != self.stock_prices[self.min_price[0][1]]:
            heapq.heappop(self.min_price)
        return self.min_price[0][0]
    

operations = ["StockPrice","update","update","current","maximum","update","maximum","update","minimum"]
op_values = [[],[1,10],[2,5],[],[],[1,3],[],[4,2],[]]  


obj = StockPrice()
for i in range(len(operations)):
    if operations[i] == "update":
        timestamp, price = op_values[i][0], op_values[i][1]
        obj.update(timestamp, price)
    elif operations[i] == "current":
        param_2 = obj.current()
        print(param_2)
    elif operations[i] == "maximum":
        param_3 = obj.maximum()
        print(param_3)
    elif operations[i] == "minimum":
        param_4 = obj.minimum()
        print(param_4)

