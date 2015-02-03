databaseChangeLog = {

	changeSet(author: "Makingdevs (generated)", id: "1422992354314-1") {
		createTable(tableName: "twitter_user") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "twitter_userPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "token", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "token_secret", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "twitter_id", type: "bigint") {
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

	changeSet(author: "Makingdevs (generated)", id: "1422992354314-16") {
		createIndex(indexName: "FKCCC78A179F6FF5B2", tableName: "twitter_user") {
			column(name: "user_id")
		}
	}

	changeSet(author: "Makingdevs (generated)", id: "1422992354314-17") {
		createIndex(indexName: "twitter_id_uniq_1422992353653", tableName: "twitter_user", unique: "true") {
			column(name: "twitter_id")
		}
	}

	changeSet(author: "Makingdevs (generated)", id: "1422992354314-13") {
		addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "twitter_user", constraintName: "FKCCC78A179F6FF5B2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user", referencesUniqueColumn: "false")
	}
}
