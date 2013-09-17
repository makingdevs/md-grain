databaseChangeLog = {

	changeSet(author: "neodevelop (generated)", id: "1375493621026-1") {
		createTable(tableName: "category") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "categoryPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "description", type: "longtext") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(100)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-2") {
		createTable(tableName: "category_course") {
			column(name: "category_courses_id", type: "bigint")

			column(name: "course_id", type: "bigint")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-3") {
		createTable(tableName: "course") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "coursePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "audience", type: "longtext") {
				constraints(nullable: "false")
			}

			column(name: "course_key", type: "varchar(20)") {
				constraints(nullable: "false")
			}

			column(name: "date_created", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "goal", type: "longtext") {
				constraints(nullable: "false")
			}

			column(name: "last_updated", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(100)") {
				constraints(nullable: "false")
			}

			column(name: "overview", type: "longtext") {
				constraints(nullable: "false")
			}

			column(name: "prerequisites", type: "longtext") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-4") {
		createTable(tableName: "profile") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "profilePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "avatar", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "date_born", type: "datetime")

			column(name: "date_created", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "last_name", type: "varchar(50)") {
				constraints(nullable: "false")
			}

			column(name: "last_updated", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "name", type: "varchar(50)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-5") {
		createTable(tableName: "requestmap") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "requestmapPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "config_attribute", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "url", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-6") {
		createTable(tableName: "role") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "rolePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "authority", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-7") {
		createTable(tableName: "user") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "userPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "account_expired", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "account_locked", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "enabled", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "password", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "password_expired", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "profile_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "username", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-8") {
		createTable(tableName: "user_role") {
			column(name: "role_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "user_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-9") {
		addPrimaryKey(columnNames: "role_id, user_id", constraintName: "user_rolePK", tableName: "user_role")
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-15") {
		createIndex(indexName: "FKB5CF267C59346DB9", tableName: "category_course") {
			column(name: "category_courses_id")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-16") {
		createIndex(indexName: "FKB5CF267CA7883DB2", tableName: "category_course") {
			column(name: "course_id")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-17") {
		createIndex(indexName: "course_key_uniq_1375493620687", tableName: "course", unique: "true") {
			column(name: "course_key")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-18") {
		createIndex(indexName: "url_uniq_1375493620717", tableName: "requestmap", unique: "true") {
			column(name: "url")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-19") {
		createIndex(indexName: "authority_uniq_1375493620720", tableName: "role", unique: "true") {
			column(name: "authority")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-20") {
		createIndex(indexName: "FK36EBCB27BFDA42", tableName: "user") {
			column(name: "profile_id")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-21") {
		createIndex(indexName: "username_uniq_1375493620732", tableName: "user", unique: "true") {
			column(name: "username")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-22") {
		createIndex(indexName: "FK143BF46A9F6FF5B2", tableName: "user_role") {
			column(name: "user_id")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-23") {
		createIndex(indexName: "FK143BF46AFA4531D2", tableName: "user_role") {
			column(name: "role_id")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-10") {
		addForeignKeyConstraint(baseColumnNames: "category_courses_id", baseTableName: "category_course", constraintName: "FKB5CF267C59346DB9", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "category", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-11") {
		addForeignKeyConstraint(baseColumnNames: "course_id", baseTableName: "category_course", constraintName: "FKB5CF267CA7883DB2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "course", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-12") {
		addForeignKeyConstraint(baseColumnNames: "profile_id", baseTableName: "user", constraintName: "FK36EBCB27BFDA42", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "profile", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-13") {
		addForeignKeyConstraint(baseColumnNames: "role_id", baseTableName: "user_role", constraintName: "FK143BF46AFA4531D2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "role", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1375493621026-14") {
		addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "user_role", constraintName: "FK143BF46A9F6FF5B2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user", referencesUniqueColumn: "false")
	}

	include file:"add-course-status.groovy"

	include file:"category-feature-images.groovy"

	include file:"add-scheduled-course.groovy"

	include file:"adding-registration.groovy"

	include file:"using-profile-plugin.groovy"

	include file:"adding-content-course.groovy"

	include file:"course-sessions.groovy"

	include file: 'adding-payable-plugin.groovy'
}
