#ifndef COURSE_COMPONENT_H_
#define COURSE_COMPONENT_H_

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

#endif  // COURSE_COMPONENT_H_
