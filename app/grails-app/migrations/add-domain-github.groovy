databaseChangeLog = {

	changeSet(author: "Makingdevs (generated)", id: "1423509046063-1") {
		createTable(tableName: "github_user") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "github_userPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "access_token", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "code", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "github_id", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "user_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "username", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Makingdevs (generated)", id: "1423509046063-14") {
		createIndex(indexName: "FK56857EA79F6FF5B2", tableName: "github_user") {
			column(name: "user_id")
		}
	}

	changeSet(author: "Makingdevs (generated)", id: "1423509046063-15") {
		createIndex(indexName: "github_id_uniq_1423509044493", tableName: "github_user", unique: "true") {
			column(name: "github_id")
		}
	}

	changeSet(author: "Makingdevs (generated)", id: "1423509046063-7") {
		addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "github_user", constraintName: "FK56857EA79F6FF5B2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user", referencesUniqueColumn: "false")
	}

}
