/*
 * @file Undergraduate.cpp
 * @author Fanyi Pu (FPU001@e.ntu.edu.sg)
 * @version 0.1
 * @date 2023-07-10
 *
 * @copyright Copyright (c) 2023
 *
 */

#ifndef CODES_COURSECALCULATOR_UNDERGRADUATE_H_
#define CODES_COURSECALCULATOR_UNDERGRADUATE_H_

#include "CourseComponent.h"
#include "Student.h"

class Undergraduate : public Student {
 private:
  constexpr static double ASSIGNMENT_PERCENTAGE = 0.4;
  constexpr static double FINAL_EXAM_PERCENTAGE = 0.6;

  CourseComponent assignment;
  CourseComponent finalExam;

 public:
  Undergraduate(const std::string &name, const int assignmentGrade,
                const int finalExamGrade);

  double calOverall() const override;
};

#endif  // CODES_COURSECALCULATOR_UNDERGRADUATE_H_
