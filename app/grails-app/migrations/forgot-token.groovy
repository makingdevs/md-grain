databaseChangeLog = {

	changeSet(author: "neodevelop (generated)", id: "1389899029725-1") {
		sql("set storage_engine=InnoDB;")
		createTable(tableName: "forgot_token") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "forgot_tokenPK")
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

			column(name: "token", type: "varchar(40)") {
				constraints(nullable: "false")
			}

			column(name: "used", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "user_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1389899029725-3") {
		createIndex(indexName: "FKBBD6D9DD9F6FF5B2", tableName: "forgot_token") {
			column(name: "user_id")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1389899029725-2") {
		addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "forgot_token", constraintName: "FKBBD6D9DD9F6FF5B2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user", referencesUniqueColumn: "false")
	}
}
