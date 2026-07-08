# class Student :

#     @staticmethod
#     def college() :
#         print(f"ABC College")

#     def __init__(self, name, marks) :
#         self.name = name
#         self.marks =  marks

#     def getDetails(self) :
#         print(f"Name :- {self.name}")
#         print(f"Marks :- {self.marks}")

#     def getMarks(self) :
#         return self.marks
    
#     def getAvg(self) :
#         sum = 0
#         for key in marks :
#             sum += marks[key]
#         avg = sum/(len(list(marks.keys())))
#         return avg
    
# marks = {
#     "DAA" : 90,
#     "DSA" : 92,
#     "COA" : 78,
#     "DE" : 68,
#     "DM" : 70
# }

# s1 = Student("Adam", marks=marks)
# print(s1.getMarks())
# print(s1.getAvg())
# s1.college()

from datetime import datetime as date

class Account :

    @staticmethod
    def bank() :
        print("Wlcome to Fedral Bank of Fraud")
    
    def __init__(self, account_number, balance) :
        self.account_number = account_number
        self.balance = balance

    def getBalance(self) :
        return self.balance
    
    def credit(self, amount) :
        if amount > 0 :
            self.balance += amount
            print("-".center(50, "-"))
            print(f"An amount of ${amount} has been credited to your account successfully\nTotal Balance :- ${self.balance}")
        else :
            print(f"Account can't be negative")

    def debit(self, amount)  :
        if amount > 0 and amount < self.balance :
            self.balance -= amount
            print("-".center(50, "-"))
            print(f"An amount of ${amount} has been debited from your account_number ({self.account_number}) on {date.now()}")
            print(f"Toatal Balance ${self.balance}")
        else :
            print(f"Amount can't be debited")

a1 = Account(123456789, 5000)
a1.bank()
print(f"Balance :- {a1.balance}")
a1.credit(1000)
a1.debit(9000)

del a1