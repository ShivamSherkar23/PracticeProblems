"""
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
"""
def defangIPaddr(address):
        result = address.replace(".","[.]")
        return result
address = "255.192.16.1"
result = defangIPaddr(address)
print(result)        