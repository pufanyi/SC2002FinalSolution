#ifndef UNDERGRADUATE_H_
#define UNDERGRADUATE_H_

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

#endif // UNDERGRADUATE_H_
