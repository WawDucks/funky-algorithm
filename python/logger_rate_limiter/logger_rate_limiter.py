class Logger:
    def __init__(self):
        self.last_logged = {}
    
    def shouldPrintMessage(self, timestamp: int, message: str):
        if message not in self.last_logged:
            self.last_logged[message] = timestamp
            return True
        else:
            return False if timestamp - self.lst_logged[message] < 10 else True


logger = Logger()
print(logger.shouldPrintMessage(1, "foo")) # return true, next allowed timestamp for "foo" is 1 + 10 = 11
print(logger.shouldPrintMessage(2, "bar"))  # return true, next allowed timestamp for "bar" is 2 + 10 = 12
print(logger.shouldPrintMessage(3, "foo")) # 3 < 11, return false
print(logger.shouldPrintMessage(8, "bar"))  # 8 < 12, return false
print(logger.shouldPrintMessage(10, "foo")) # 10 < 11, return false
print(logger.shouldPrintMessage(11, "foo")) # 11 >= 11, return true, next allowed timestamp for "foo" is 11 + 10 = 2