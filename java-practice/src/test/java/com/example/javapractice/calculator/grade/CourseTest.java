package com.example.javapractice.calculator.grade;

import com.example.javapractice.calculator.grade.Course;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class CourseTest {

    @DisplayName("과목(코스)을 생성한다.")
    @Test
    void createTest() {
        assertThatCode(() -> new Course("OOP", 3, "A+"))
                .doesNotThrowAnyException();
    }
}
