databaseChangeLog = {

	changeSet(author: "Jorge (generated)", id: "1392574891367-2") {
		createTable(tableName: "answer") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "answerPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "description", type: "longtext") {
				constraints(nullable: "false")
			}

			column(name: "question_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "solution", type: "bit") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-3") {
		createTable(tableName: "answer_per_instance") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "answer_per_inPK")
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

			column(name: "question_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "questionary_per_instance_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-4") {
		createTable(tableName: "answer_per_user") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "answer_per_usPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "answer_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "answer_per_instance_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "date_created", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "last_updated", type: "datetime") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-5") {
		createTable(tableName: "open_answer_per_user") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "open_answer_pPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "answer_per_instance_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "date_created", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "last_updated", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "user_answer", type: "longtext")
		}
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-6") {
		createTable(tableName: "question") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "questionPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "description", type: "longtext") {
				constraints(nullable: "false")
			}

			column(name: "question_type", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-7") {
		createTable(tableName: "questionary") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "questionaryPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "code_name", type: "varchar(100)") {
				constraints(nullable: "false")
			}

			column(name: "description", type: "longtext") {
				constraints(nullable: "false")
			}

			column(name: "title", type: "varchar(100)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-8") {
		createTable(tableName: "questionary_per_instance") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "questionary_pPK")
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

			column(name: "questionary_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "questionary_per_instance_status", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-9") {
		createTable(tableName: "questionary_per_instance_link") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "questionary_pPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "questionary_per_instance_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "questionary_per_instance_ref", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "type", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-10") {
		createTable(tableName: "questionary_question") {
			column(name: "questionary_questions_id", type: "bigint")

			column(name: "question_id", type: "bigint")
		}
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-22") {
		createIndex(indexName: "FKABCA3FBEF5588FD2", tableName: "answer") {
			column(name: "question_id")
		}
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-23") {
		createIndex(indexName: "FK11723458F5588FD2", tableName: "answer_per_instance") {
			column(name: "question_id")
		}
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-24") {
		createIndex(indexName: "FK11723458F8DD83EE", tableName: "answer_per_instance") {
			column(name: "questionary_per_instance_id")
		}
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-25") {
		createIndex(indexName: "FK7786E50E689FA3BE", tableName: "answer_per_user") {
			column(name: "answer_per_instance_id")
		}
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-26") {
		createIndex(indexName: "FK7786E50EB1A1F6D2", tableName: "answer_per_user") {
			column(name: "answer_id")
		}
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-27") {
		createIndex(indexName: "FKCCEA8D19689FA3BE", tableName: "open_answer_per_user") {
			column(name: "answer_per_instance_id")
		}
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-28") {
		createIndex(indexName: "FKE0DACDD430FD83A2", tableName: "questionary_per_instance") {
			column(name: "questionary_id")
		}
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-29") {
		createIndex(indexName: "FKD80E1F85F8DD83EE", tableName: "questionary_per_instance_link") {
			column(name: "questionary_per_instance_id")
		}
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-30") {
		createIndex(indexName: "FKF27EBAC368F8A794", tableName: "questionary_question") {
			column(name: "questionary_questions_id")
		}
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-31") {
		createIndex(indexName: "FKF27EBAC3F5588FD2", tableName: "questionary_question") {
			column(name: "question_id")
		}
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-12") {
		addForeignKeyConstraint(baseColumnNames: "question_id", baseTableName: "answer", constraintName: "FKABCA3FBEF5588FD2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "question", referencesUniqueColumn: "false")
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-13") {
		addForeignKeyConstraint(baseColumnNames: "question_id", baseTableName: "answer_per_instance", constraintName: "FK11723458F5588FD2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "question", referencesUniqueColumn: "false")
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-14") {
		addForeignKeyConstraint(baseColumnNames: "questionary_per_instance_id", baseTableName: "answer_per_instance", constraintName: "FK11723458F8DD83EE", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "questionary_per_instance", referencesUniqueColumn: "false")
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-15") {
		addForeignKeyConstraint(baseColumnNames: "answer_id", baseTableName: "answer_per_user", constraintName: "FK7786E50EB1A1F6D2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "answer", referencesUniqueColumn: "false")
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-16") {
		addForeignKeyConstraint(baseColumnNames: "answer_per_instance_id", baseTableName: "answer_per_user", constraintName: "FK7786E50E689FA3BE", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "answer_per_instance", referencesUniqueColumn: "false")
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-17") {
		addForeignKeyConstraint(baseColumnNames: "answer_per_instance_id", baseTableName: "open_answer_per_user", constraintName: "FKCCEA8D19689FA3BE", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "answer_per_instance", referencesUniqueColumn: "false")
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-18") {
		addForeignKeyConstraint(baseColumnNames: "questionary_id", baseTableName: "questionary_per_instance", constraintName: "FKE0DACDD430FD83A2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "questionary", referencesUniqueColumn: "false")
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-19") {
		addForeignKeyConstraint(baseColumnNames: "questionary_per_instance_id", baseTableName: "questionary_per_instance_link", constraintName: "FKD80E1F85F8DD83EE", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "questionary_per_instance", referencesUniqueColumn: "false")
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-20") {
		addForeignKeyConstraint(baseColumnNames: "question_id", baseTableName: "questionary_question", constraintName: "FKF27EBAC3F5588FD2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "question", referencesUniqueColumn: "false")
	}

	changeSet(author: "Jorge (generated)", id: "1392574891367-21") {
		addForeignKeyConstraint(baseColumnNames: "questionary_questions_id", baseTableName: "questionary_question", constraintName: "FKF27EBAC368F8A794", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "questionary", referencesUniqueColumn: "false")
	}
}
