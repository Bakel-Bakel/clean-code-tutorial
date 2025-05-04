class badcode:
    def __init__(self,m,n):
        self.m = m
        self.n = n
    
    def create(self):
        if self.m== 'Max':
            return lambda v: v < self.n
        elif self.m == 'Min':
            return lambda v: v > self.n

max = badcode('Max', 31)
print(max.create()(32))

class Comparator:
    def __init__(self, mode, threshold):
        self.mode = mode
        self.threshold = threshold
        self.comparator = self.__create_comparator()

    def __create_comparator(self):
        if self.mode == 'Max':
            return lambda v: v < self.threshold
        elif self.mode == 'Min':
            return lambda v: v > self.threshold
        else:
            raise ValueError("Mode must be 'Max' or 'Min'")

    def compare(self, value):
        return self.comparator(value)


max_comp = Comparator('Max', 31)
print(max_comp.compare(32))