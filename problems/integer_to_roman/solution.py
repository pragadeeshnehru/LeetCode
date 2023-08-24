class Solution(object):
    def intToRoman(self, num):
     # G and H is not a part of the standard roman numeral system but the code still works...
        romanSym = \
            {
                1:"I",
                5:"V",
                10:"X",
                50:"L",
                100:"C",
                500:"D",
                1000:"M",
                5000:"G",
                10000:"H"
            }
        div =1
        
        while num>=div:
            div*=10

        div/=10

        res=""

        while num:
            significantNum = int(num /div)

            if significantNum <=3:
                res += (romanSym[div]*significantNum)
            elif significantNum == 4:
                res += (romanSym[div] + romanSym[div * 5])
            elif 5 <= significantNum <= 8:
                res += (romanSym[div * 5] + (romanSym[div] * (significantNum - 5)))
            elif significantNum == 9:
                res += (romanSym[div] + romanSym[div * 10])

            num = math.floor(num%div)
            div/=10

        return res