/**
 * @file CourseComponent.h
 * @author Fanyi Pu (FPU001@e.ntu.edu.sg)
 * @version 0.1
 * @date 2023-07-10
 *
 * @copyright Copyright (c) 2023
 *
 */

#ifndef CODES_COURSECALCULATOR_COURSECOMPONENT_H_
#define CODES_COURSECALCULATOR_COURSECOMPONENT_H_

#include <string>

class CourseComponent {
 private:
  std::string componentName;
  double percentage;
  int score;

 public:
  CourseComponent(const std::string &componentName, double percentage,
                  int score);

  double getPercentage() const;

  int getScore() const;
};

#endif  // CODES_COURSECALCULATOR_COURSECOMPONENT_H_
