databaseChangeLog = {

	changeSet(author: "neodevelop (generated)", id: "1375980068355-1") {
		createTable(tableName: "scheduled_course") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "scheduled_couPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "begin_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "cost_by_course", type: "decimal(19,2)") {
				constraints(nullable: "false")
			}

			column(name: "course_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "date_created", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "duration_in_hours", type: "integer") {
				constraints(nullable: "false")
			}

			column(name: "full_address", type: "longtext")

			column(name: "geolocation", type: "varchar(200)")

			column(name: "last_updated", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "limit_registration_date", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "scheduled_course_status", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1375980068355-2") {
		addColumn(tableName: "category") {
			column(name: "date_created", type: "datetime") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1375980068355-3") {
		addColumn(tableName: "category") {
			column(name: "last_updated", type: "datetime") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1375980068355-4") {
		addNotNullConstraint(columnDataType: "varchar(255)", columnName: "course_status", tableName: "course")
	}

	changeSet(author: "neodevelop (generated)", id: "1375980068355-11") {
		createIndex(indexName: "FK70BA6FEDA7883DB2", tableName: "scheduled_course") {
			column(name: "course_id")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1375980068355-12") {
		sql("update category set date_created=now(), last_updated=now() where 1=1")
	}
}
