#ifndef POSTGRADUATE_H_
#define POSTGRADUATE_H_

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

#endif  // POSTGRADUATE_H_
