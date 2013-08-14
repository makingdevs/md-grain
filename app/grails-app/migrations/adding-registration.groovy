databaseChangeLog = {

	changeSet(author: "neodevelop (generated)", id: "1376345292571-1") {
		createTable(tableName: "registration") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "registrationPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "date_created", type: "datetime")

			column(name: "invoice", type: "bit")

			column(name: "last_updated", type: "datetime")

			column(name: "registration_status", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "scheduled_course_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "user_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1376345292571-11") {
		createIndex(indexName: "FKAF83E8B9B65882FD", tableName: "registration") {
			column(name: "scheduled_course_id")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1376345292571-10") {
		createIndex(indexName: "FKAF83E8B99F6FF5B2", tableName: "registration") {
			column(name: "user_id")
		}
	}

}
