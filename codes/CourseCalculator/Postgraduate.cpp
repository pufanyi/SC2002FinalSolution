/**
 * @file Postgraduate.cpp
 * @author Fanyi Pu (FPU001@e.ntu.edu.sg)
 * @version 0.1
 * @date 2023-07-10
 *
 * @copyright Copyright (c) 2023
 *
 */

#include "Postgraduate.h"

Postgraduate::Postgraduate(const std::string &name, const int assignmentGrade,
                           const int researchReportGrade,
                           const int finalExamGrade)
    : Student(name),
      assignment("Assignment", ASSIGNMENT_PERCENTAGE, assignmentGrade),
      researchReport("Research Report", RESEARCH_REPORT_PERCENTAGE,
                     researchReportGrade),
      finalExam("Final Exam", FINAL_EXAM_PERCENTAGE, finalExamGrade) {}

double Postgraduate::calOverall() const {
  return assignment.getPercentage() * assignment.getScore() +
         researchReport.getPercentage() * researchReport.getScore() +
         finalExam.getPercentage() * finalExam.getScore();
}
