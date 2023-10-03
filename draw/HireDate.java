package draw;

public class HireDate {

    private String month, date, year;

    public HireDate(String month, String date, String year) {
        this.month = month;
        this.date = date;
        this.year = year;
       // return  month +  "-"  + date + "-" + year;

    }

//    public String HireDate() {
//        return " ";
//    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }



    //    public void printDate() {
//
//    }

    @Override
    public String toString() {
        return "HireDate" +
                "/" + month + '\'' +
                "/" + date + '\'' +
                "/" + year + '\'';
    }
}


