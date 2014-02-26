databaseChangeLog = {

    changeSet(author: "jorge", id: "add-colors-to-course-0") {
        addColumn(tableName: "course") {
            column(name: "background_color", type: "varchar(6)"){
            }
        }

        grailsChange {
            change {
                sql.execute("update course set background_color='3A87AD' ")

            }
            rollback {
            }
        }
    }

    changeSet(author: "jorge", id: "add-colors-to-course-1") {
        addNotNullConstraint(columnDataType: "varchar(6)", columnName: "background_color", tableName: "course")
    }



    changeSet(author: "jorge", id: "add-colors-to-course-2") {
        addColumn(tableName: "course") {
            column(name: "border_color", type: "varchar(6)"){
            }
        }

        grailsChange {
            change {
                sql.execute("update course set border_color='3A87AD' ")

            }
            rollback {
            }
        }
    }

    changeSet(author: "jorge", id: "add-colors-to-course-3") {
        addNotNullConstraint(columnDataType: "varchar(6)", columnName: "border_color", tableName: "course")
    }



    changeSet(author: "jorge", id: "add-colors-to-course-4") {
        addColumn(tableName: "course") {
            column(name: "font_color", type: "varchar(6)"){
            }
        }

        grailsChange {
            change {
                sql.execute("update course set font_color='FFFFFF' ")

            }
            rollback {
            }
        }
    }

    changeSet(author: "jorge", id: "add-colors-to-course-5") {
        addNotNullConstraint(columnDataType: "varchar(6)", columnName: "font_color", tableName: "course")
    }


}