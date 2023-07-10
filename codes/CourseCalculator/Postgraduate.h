/**
 * @file Postgraduate.h
 * @author Fanyi Pu (FPU001@e.ntu.edu.sg)
 * @version 0.1
 * @date 2023-07-10
 *
 * @copyright Copyright (c) 2023
 *
 */

#ifndef CODES_COURSECALCULATOR_POSTGRADUATE_H_
#define CODES_COURSECALCULATOR_POSTGRADUATE_H_

#include "CourseComponent.h"
#include "Student.h"

class Postgraduate : public Student {
 private:
  constexpr static double ASSIGNMENT_PERCENTAGE = 0.2;
  constexpr static double RESEARCH_REPORT_PERCENTAGE = 0.2;
  constexpr static double FINAL_EXAM_PERCENTAGE = 0.6;

  CourseComponent assignment;
  CourseComponent researchReport;
  CourseComponent finalExam;

 public:
  Postgraduate(const std::string &name, const int assignmentGrade,
               const int researchReportGrade, const int finalExamGrade);

  double calOverall() const override;
};

#endif  // CODES_COURSECALCULATOR_POSTGRADUATE_H_
