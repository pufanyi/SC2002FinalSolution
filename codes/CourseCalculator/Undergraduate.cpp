/**
 * @file Undergraduate.cpp
 * @author Fanyi Pu (FPU001@e.ntu.edu.sg)
 * @version 0.1
 * @date 2023-07-10
 *
 * @copyright Copyright (c) 2023
 *
 */

#include "Undergraduate.h"

#include <string>

Undergraduate::Undergraduate(const std::string &name, const int assignmentGrade,
                             const int finalExamGrade)
    : Student(name),
      assignment("Assignment", ASSIGNMENT_PERCENTAGE, assignmentGrade),
      finalExam("Final Exam", FINAL_EXAM_PERCENTAGE, finalExamGrade) {}

double Undergraduate::calOverall() const {
  return assignment.getPercentage() * assignment.getScore() +
         finalExam.getPercentage() * finalExam.getScore();
}
