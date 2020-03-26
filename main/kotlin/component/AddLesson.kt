package component

import data.Student
import data.Subject
import data.subjectList
import kotlinx.html.ButtonType
import kotlinx.html.InputType
import react.*
import react.dom.*
import kotlin.browser.document


interface AppLessonProps : RProps {
    var students: Array<Student>
}

interface AppLessonState : RState {
    var lessons: Array<Subject>
    var presents: Array<Array<Boolean>>
}


class AppLessons : RComponent<AppLessonProps, AppLessonState>() {
    override fun RBuilder.render() {
    div {
        h3 {
            +"Введите название предмета"
        }

        input(type = InputType.text, name = "key")
        {


        }
        input (type = InputType.submit, name = "send")
        {
        }

        subjectList

    }
}}

fun RBuilder.applesson(
    students: Array<Student>
) = child(AppLessons::class) {
    attrs.students = students
}
