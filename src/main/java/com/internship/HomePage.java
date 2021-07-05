package com.internship;

public class HomePage {

    static String url = "https://www.pearsonassessments.com/";
    static String title = ("Pearson Assessments");

    public void goTo() {
        Browser.goTo(url);

    }

    public boolean isAt() {
        return Browser.title().equals(title);
    }


}
