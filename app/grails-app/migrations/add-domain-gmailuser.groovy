databaseChangeLog = {

	changeSet(author: "humberto2do (generated)", id: "1423803247703-1") {
		createTable(tableName: "gmail_user") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "gmail_userPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "access_token", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "gmail_id", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "user_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "humberto2do (generated)", id: "1423803247703-14") {
		createIndex(indexName: "FK372D1CCC9F6FF5B2", tableName: "gmail_user") {
			column(name: "user_id")
		}
	}

	changeSet(author: "humberto2do (generated)", id: "1423803247703-15") {
		createIndex(indexName: "gmail_id_uniq_1423803247150", tableName: "gmail_user", unique: "true") {
			column(name: "gmail_id")
		}
	}

	changeSet(author: "humberto2do (generated)", id: "1423803247703-7") {
		addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "gmail_user", constraintName: "FK372D1CCC9F6FF5B2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user", referencesUniqueColumn: "false")
	}
}
