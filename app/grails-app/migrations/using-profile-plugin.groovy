databaseChangeLog = {

	changeSet(author: "neodevelop (generated)", id: "1377019288271-0") {
		sql("ALTER TABLE DATABASECHANGELOG ENGINE=InnoDB;")
		sql("ALTER TABLE DATABASECHANGELOGLOCK ENGINE=InnoDB;")
		sql("ALTER TABLE category ENGINE=InnoDB;")
		sql("ALTER TABLE category_course ENGINE=InnoDB;")
		sql("ALTER TABLE course ENGINE=InnoDB;")
		sql("ALTER TABLE profile ENGINE=InnoDB;")
		sql("ALTER TABLE registration ENGINE=InnoDB;")
		sql("ALTER TABLE requestmap ENGINE=InnoDB;")
		sql("ALTER TABLE role ENGINE=InnoDB;")
		sql("ALTER TABLE scheduled_course ENGINE=InnoDB;")
		sql("ALTER TABLE user ENGINE=InnoDB;")
		sql("ALTER TABLE user_role ENGINE=InnoDB;		")
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-1") {
		sql("set storage_engine=InnoDB;")
		createTable(tableName: "direccion") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "direccionPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "calle", type: "varchar(100)") {
				constraints(nullable: "false")
			}

			column(name: "ciudad", type: "varchar(255)")

			column(name: "codigo_postal", type: "varchar(6)") {
				constraints(nullable: "false")
			}

			column(name: "colonia", type: "varchar(100)") {
				constraints(nullable: "false")
			}

			column(name: "date_created", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "delegacion_municipio", type: "varchar(100)") {
				constraints(nullable: "false")
			}

			column(name: "estado", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "last_updated", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "numero_exterior", type: "varchar(100)") {
				constraints(nullable: "false")
			}

			column(name: "numero_interior", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-2") {
		sql("set storage_engine=InnoDB;")
		createTable(tableName: "perfil") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "perfilPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "apellido_materno", type: "varchar(50)")

			column(name: "apellido_paterno", type: "varchar(50)") {
				constraints(nullable: "false")
			}

			column(name: "avatar", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "date_created", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "fecha_de_nacimiento", type: "datetime")

			column(name: "last_updated", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "nombre", type: "varchar(50)") {
				constraints(nullable: "false")
			}

			column(name: "sexo", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-2b") {
		sql("""
			insert into perfil (id,version,	apellido_paterno,	avatar,	date_created,	fecha_de_nacimiento	,last_updated,	nombre, sexo) 
			select 							id,version,last_name, 				avatar,	date_created,	date_born ,					 last_updated,	name, 	'' from profile
			""")
		sql("update perfil set sexo='QUIMERA' where 1=1")
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-3") {
		sql("set storage_engine=InnoDB;")
		createTable(tableName: "perfil_direccion") {
			column(name: "perfil_direccion_id", type: "bigint")

			column(name: "direccion_id", type: "bigint")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-4") {
		sql("set storage_engine=InnoDB;")
		createTable(tableName: "perfil_telefono") {
			column(name: "perfil_telefonos_id", type: "bigint")

			column(name: "telefono_id", type: "bigint")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-5") {
		sql("set storage_engine=InnoDB;")
		createTable(tableName: "telefono") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "telefonoPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "date_created", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "extension", type: "varchar(6)")

			column(name: "lada", type: "varchar(255)")

			column(name: "last_updated", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "numero_telefonico", type: "varchar(10)") {
				constraints(nullable: "false")
			}

			column(name: "principal", type: "bit") {
				constraints(nullable: "false")
			}

			column(name: "tipo_de_telefono", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-6") {
		addColumn(tableName: "user") {
			column(name: "perfil_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-6b") {
		sql("update user u set u.perfil_id=u.profile_id where u.id = u.id;")
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-19") {
		dropIndex(indexName: "FK36EBCB27BFDA42", tableName: "user")
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-20") {
		createIndex(indexName: "FK268BE27D165511C1", tableName: "perfil_direccion") {
			column(name: "perfil_direccion_id")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-21") {
		createIndex(indexName: "FK268BE27DA649AEE2", tableName: "perfil_direccion") {
			column(name: "direccion_id")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-22") {
		createIndex(indexName: "FK88B678073F1CC492", tableName: "perfil_telefono") {
			column(name: "perfil_telefonos_id")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-23") {
		createIndex(indexName: "FK88B67807E8FC8D12", tableName: "perfil_telefono") {
			column(name: "telefono_id")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-24") {
		sql("SET foreign_key_checks = 0;")
		createIndex(indexName: "FK36EBCB82201412", tableName: "user") {
			column(name: "perfil_id")
		}
		sql("SET foreign_key_checks = 1;")
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-25") {
		dropColumn(columnName: "profile_id", tableName: "user")
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-26") {
		dropTable(tableName: "profile")
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-7") {
		addForeignKeyConstraint(baseColumnNames: "category_courses_id", baseTableName: "category_course", constraintName: "FKB5CF267C59346DB9", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "category", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-8") {
		addForeignKeyConstraint(baseColumnNames: "course_id", baseTableName: "category_course", constraintName: "FKB5CF267CA7883DB2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "course", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-9") {
		addForeignKeyConstraint(baseColumnNames: "direccion_id", baseTableName: "perfil_direccion", constraintName: "FK268BE27DA649AEE2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "direccion", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-10") {
		addForeignKeyConstraint(baseColumnNames: "perfil_direccion_id", baseTableName: "perfil_direccion", constraintName: "FK268BE27D165511C1", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "perfil", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-11") {
		addForeignKeyConstraint(baseColumnNames: "perfil_telefonos_id", baseTableName: "perfil_telefono", constraintName: "FK88B678073F1CC492", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "perfil", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-12") {
		addForeignKeyConstraint(baseColumnNames: "telefono_id", baseTableName: "perfil_telefono", constraintName: "FK88B67807E8FC8D12", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "telefono", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-13") {
		addForeignKeyConstraint(baseColumnNames: "scheduled_course_id", baseTableName: "registration", constraintName: "FKAF83E8B9B65882FD", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "scheduled_course", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-14") {
		addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "registration", constraintName: "FKAF83E8B99F6FF5B2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-15") {
		addForeignKeyConstraint(baseColumnNames: "course_id", baseTableName: "scheduled_course", constraintName: "FK70BA6FEDA7883DB2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "course", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-16") {
		sql("SET foreign_key_checks = 0;")
		addForeignKeyConstraint(baseColumnNames: "perfil_id", baseTableName: "user", constraintName: "FK36EBCB82201412", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "perfil", referencesUniqueColumn: "false")
		sql("SET foreign_key_checks = 1;")
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-17") {
		addForeignKeyConstraint(baseColumnNames: "role_id", baseTableName: "user_role", constraintName: "FK143BF46AFA4531D2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "role", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1377019288271-18") {
		addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "user_role", constraintName: "FK143BF46A9F6FF5B2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user", referencesUniqueColumn: "false")
	}
}
