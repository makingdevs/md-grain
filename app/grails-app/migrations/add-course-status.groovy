databaseChangeLog = {

	changeSet(author: "neodevelop (generated)", id: "1375799703202-1") {
		addColumn(tableName: "course") {
			column(name: "course_status", type: "varchar(25)") {
				constraints(nullable: "false")
			}
		}
		sql("update course set course_status='NEW'")
	}

	changeSet(author: "neodevelop (generated)", id: "1375799703202-2") {
		addForeignKeyConstraint(baseColumnNames: "category_courses_id", baseTableName: "category_course", constraintName: "FKB5CF267C59346DB9", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "category", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1375799703202-3") {
		addForeignKeyConstraint(baseColumnNames: "course_id", baseTableName: "category_course", constraintName: "FKB5CF267CA7883DB2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "course", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1375799703202-4") {
		addForeignKeyConstraint(baseColumnNames: "profile_id", baseTableName: "user", constraintName: "FK36EBCB27BFDA42", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "profile", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1375799703202-5") {
		addForeignKeyConstraint(baseColumnNames: "role_id", baseTableName: "user_role", constraintName: "FK143BF46AFA4531D2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "role", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1375799703202-6") {
		addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "user_role", constraintName: "FK143BF46A9F6FF5B2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user", referencesUniqueColumn: "false")
	}
}
