#include "CourseComponent.h"

#include <string>

CourseComponent::CourseComponent(const std::string &componentName,
                                 const double percentage, const int score)
    : componentName(componentName), percentage(percentage), score(score) {}

double CourseComponent::getPercentage() const {
  return percentage;
}

int CourseComponent::getScore() const {
  return score;
}
