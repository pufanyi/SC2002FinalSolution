#include "Undergraduate.h"

Undergraduate::Undergraduate(const std::string &name, const int assignmentGrade,
                             const int finalExamGrade)
    : Student(name),
      assignment("Assignment", ASSIGNMENT_PERCENTAGE, assignmentGrade),
      finalExam("Final Exam", FINAL_EXAM_PERCENTAGE, finalExamGrade) {}

double Undergraduate::calOverall() const {
  return assignment.getPercentage() * assignment.getScore() +
         finalExam.getPercentage() * finalExam.getScore();
}
