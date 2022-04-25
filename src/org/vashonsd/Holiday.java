package org.vashonsd;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Holiday {
    String name;
    String descrip;
    int month;
    int day;
    Boolean fedrec;

    public Holiday() {
        this.name = name;
        this.descrip = descrip;
        this.month = month;
        this.day = day;
        this.fedrec = fedrec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean isFedrec() {
        return fedrec;
    }

    public void setFedrec(boolean fedrec) {
        this.fedrec = fedrec;
    }

    @Override
    public String toString() {
        return "holiday{" +
                "The name is'" + name + '\'' +
                ", descrip='" + descrip + '\'' +
                ", month=" + month +
                ", day=" + day +
                ", fedrec=" + fedrec +
                '}';
    }
    public static Boolean isToday (int month, int day) {
        DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("MM dd");
        LocalDateTime today = LocalDateTime.now();
        String formated = today.format(formatter);
        if (formated.substring(0, 3).equals(String.valueOf(month)) && formated.substring(3, formated.length(3, 6).equals(String.valueOf(day)))) {
            return true;
        }
        return false;
    }
}
