package com.example.javapractice.calculator.grade;

import java.util.List;

public class GradeCalculator {

    private final Courses courses; // --> 일급 컬렉션 사용
//    private final List<Course> courses;

//    public GradeCalculator(List<Course> courses) {
//        this.courses = courses;
//    }

    public GradeCalculator(List<Course> courses) {
        this. courses = new Courses(courses);
    }

    //학점 계산하기
    public double calculateGrade() {
        // 학점수 * 교과목 평점수 합계
//        double multipliedCreditAndCourseGrade = 0;
        double totalMultipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();
//        for (Course course: courses) {
////            multipliedCreditAndCourseGrade += course.getCredit() * course.getGradeToNumber(); --> getter 방식
//            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
//        }

        //수강신청 총 학점 수
        int totalCompleteCredit = courses.calculateTotalCompletedCredits();
//        int totalCompleteCredit = courses.stream()
//                .mapToInt(Course::getCredit)
//                .sum();

        return totalMultipliedCreditAndCourseGrade / totalCompleteCredit;
    }
}
