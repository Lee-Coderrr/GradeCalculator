package org.example;

import java.util.List;

public class GradeCalculator {
    private final Courses courses; // 일급 컬렉션


    public GradeCalculator(Courses courses) {
        this.courses = courses;
    }

    public double calculateGrade() {
        // (학점 수 * 교과목 평점)의 합계
        double totalMultipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();

        int totalCompletedCredit = courses.totalCompletedCredit();

        return totalMultipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}
