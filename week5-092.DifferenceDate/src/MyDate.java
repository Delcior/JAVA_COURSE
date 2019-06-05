public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }
    public int differenceInYears(MyDate compared){
        int value=0;
            if(compared.earlier(this)){
                for(int i=1;;i++){
                    if((this.year-(compared.year+i))>=1){
                        value++;
                    }else if(this.year==(compared.year)+i){
                        if(this.month>=compared.month&&this.day>=compared.day){
                            value++;
                        }else{
                            break;
                        }
                    }else{
                        break;
                    }
                }
            }else{
                for(int i=1;;i++){
                    if((compared.year-(this.year+i))>=1){
                        value++;
                    }else if(compared.year==(this.year)+i){
                        if(compared.month>=this.month&&compared.day>=this.day){
                            value++;
                        }else{
                            break;
                        }
                    }else{
                        break;
                    }
                }
            }
        return value;
    }


    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

}
