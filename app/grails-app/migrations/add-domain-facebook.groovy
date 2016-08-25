databaseChangeLog = {

	changeSet(author: "Makingdevs (generated)", id: "1422388464962-1") {
		createTable(tableName: "facebook_user") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "facebook_userPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "access_token", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "access_token_expires", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "uid", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "user_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Makingdevs (generated)", id: "1422388464962-14") {
		createIndex(indexName: "FK609FD5A49F6FF5B2", tableName: "facebook_user") {
			column(name: "user_id")
		}
	}

	changeSet(author: "Makingdevs (generated)", id: "1422388464962-15") {
		createIndex(indexName: "uid_uniq_1422388464357", tableName: "facebook_user", unique: "true") {
			column(name: "uid")
		}
	}

	changeSet(author: "Makingdevs (generated)", id: "1422388464962-7") {
		addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "facebook_user", constraintName: "FK609FD5A49F6FF5B2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user", referencesUniqueColumn: "false")
	}

}
