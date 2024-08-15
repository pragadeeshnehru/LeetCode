



class LemonadeStand {
    constructor() {
        this.fives = 0;
        this.tens = 0;
    }

    canProvideChange(bills) {
        for (let bill of bills) {
            if (!this.processTransaction(bill)) {
                return false;
            }
        }
        return true;
    }

    processTransaction(bill) {
        switch (bill) {
            case 5:
                this.fives++;
                return true;
            case 10:
                if (this.fives === 0) return false;
                this.fives--;
                this.tens++;
                return true;
            case 20:
                return this.provideChangeFor20();
            default:
                throw new Error("Invalid bill");
        }
    }

    provideChangeFor20() {
        if (this.tens > 0 && this.fives > 0) {
            this.tens--;
            this.fives--;
        } else if (this.fives >= 3) {
            this.fives -= 3;
        } else {
            return false;
        }
        return true;
    }
}

/**
 * @param {number[]} bills
  * @return {boolean}
   */
var lemonadeChange = function (bills) {
    return new LemonadeStand().canProvideChange(bills);
};

