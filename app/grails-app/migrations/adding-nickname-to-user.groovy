databaseChangeLog = {

	changeSet(author: "makingdevs (generated)", id: "1405618742303-1") {
		createTable(tableName: "tag_links") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "tag_linksPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "tag_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "tag_ref", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "type", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1405618742303-2") {
		createTable(tableName: "tags") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "tagsPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1405618742303-3") {
		addColumn(tableName: "user") {
			column(name: "nickname", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1405618742303-15") {
		createIndex(indexName: "FK7C35D6D45A3B441D", tableName: "tag_links") {
			column(name: "tag_id")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1405618742303-16") {
		createIndex(indexName: "name_uniq_1405618741898", tableName: "tags", unique: "true") {
			column(name: "name")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1405618742303-4") {
		addForeignKeyConstraint(baseColumnNames: "question_id", baseTableName: "answer", constraintName: "FKABCA3FBEF5588FD2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "question", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1405618742303-5") {
		addForeignKeyConstraint(baseColumnNames: "question_id", baseTableName: "answer_per_instance", constraintName: "FK11723458F5588FD2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "question", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1405618742303-6") {
		addForeignKeyConstraint(baseColumnNames: "questionary_per_instance_id", baseTableName: "answer_per_instance", constraintName: "FK11723458F8DD83EE", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "questionary_per_instance", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1405618742303-7") {
		addForeignKeyConstraint(baseColumnNames: "answer_id", baseTableName: "answer_per_user", constraintName: "FK7786E50EB1A1F6D2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "answer", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1405618742303-8") {
		addForeignKeyConstraint(baseColumnNames: "answer_per_instance_id", baseTableName: "answer_per_user", constraintName: "FK7786E50E689FA3BE", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "answer_per_instance", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1405618742303-9") {
		addForeignKeyConstraint(baseColumnNames: "answer_per_instance_id", baseTableName: "open_answer_per_user", constraintName: "FKCCEA8D19689FA3BE", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "answer_per_instance", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1405618742303-10") {
		addForeignKeyConstraint(baseColumnNames: "questionary_id", baseTableName: "questionary_per_instance", constraintName: "FKE0DACDD430FD83A2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "questionary", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1405618742303-11") {
		addForeignKeyConstraint(baseColumnNames: "questionary_per_instance_id", baseTableName: "questionary_per_instance_link", constraintName: "FKD80E1F85F8DD83EE", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "questionary_per_instance", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1405618742303-12") {
		addForeignKeyConstraint(baseColumnNames: "question_id", baseTableName: "questionary_question", constraintName: "FKF27EBAC3F5588FD2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "question", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1405618742303-13") {
		addForeignKeyConstraint(baseColumnNames: "questionary_questions_id", baseTableName: "questionary_question", constraintName: "FKF27EBAC368F8A794", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "questionary", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1405618742303-14") {
		addForeignKeyConstraint(baseColumnNames: "tag_id", baseTableName: "tag_links", constraintName: "FK7C35D6D45A3B441D", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "tags", referencesUniqueColumn: "false")
	}
}
