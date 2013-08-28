databaseChangeLog = {

	changeSet(author: "neodevelop (generated)", id: "1377658064939-1") {
		createTable(tableName: "course_session") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "course_sessioPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "date_created", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "last_updated", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "scheduled_course_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "session_end_time", type: "datetime")

			column(name: "session_start_time", type: "datetime") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1377658064939-3") {
		createIndex(indexName: "FKD47ABE72B65882FD", tableName: "course_session") {
			column(name: "scheduled_course_id")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1377658064939-2") {
		addForeignKeyConstraint(baseColumnNames: "scheduled_course_id", baseTableName: "course_session", constraintName: "FKD47ABE72B65882FD", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "scheduled_course", referencesUniqueColumn: "false")
	}
}
