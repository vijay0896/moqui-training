def Courses = ec.entity.makeValue("Courses")
Courses.setFields(context, true, null, null)
if (!Courses.trainingId) Courses.setSequencedIdPrimary()
Courses.create()
