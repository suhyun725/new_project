name = ""
names = []

while True:
    name = input("이름 입력 (q 입력시 종료): ")

    if name == "q": break

    names.append(name)


for i in range (len(names)-1, -1, -1) :
    print(names[i])