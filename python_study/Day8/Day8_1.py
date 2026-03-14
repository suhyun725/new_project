class Car:
    def __init__(self, brand, color, speed):
        self.brand = brand
        self.color = color 
        self.speed = speed

    def print_info(self):
        print(f"브랜드: {self.brand}")
        print(f"색상: {self.color}")
        print(f"속도: {self.speed}km/h")


s1 = Car("현대", "빨강", 100)
s1.print_info()