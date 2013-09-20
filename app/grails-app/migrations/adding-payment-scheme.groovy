databaseChangeLog = {

	changeSet(author: "neodevelop (generated)", id: "1379464472380-0") {
		sql("ALTER TABLE concepto ENGINE=InnoDB;")
		sql("ALTER TABLE course_session ENGINE=InnoDB;")
		sql("ALTER TABLE descuento ENGINE=InnoDB;")
		sql("ALTER TABLE esquema_de_pago ENGINE=InnoDB;")
		sql("ALTER TABLE esquema_de_pago_descuento ENGINE=InnoDB;")
		sql("ALTER TABLE organizacion_direccion ENGINE=InnoDB;")
		sql("ALTER TABLE organizacion_telefono ENGINE=InnoDB;")
		sql("ALTER TABLE pago ENGINE=InnoDB;")
		sql("ALTER TABLE pago_descuento ENGINE=InnoDB;")
		sql("ALTER TABLE payable_pago ENGINE=InnoDB;")
		sql("ALTER TABLE recargo ENGINE=InnoDB;")
		sql("ALTER TABLE s3asset_options ENGINE=InnoDB;")
		sql("ALTER TABLE scheduled_course ENGINE=InnoDB;")
		sql("ALTER TABLE organizacion ENGINE=InnoDB;")
		sql("ALTER TABLE payable ENGINE=InnoDB;")
		sql("ALTER TABLE s3asset ENGINE=InnoDB;")

	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-1") {
		addColumn(tableName: "scheduled_course") {
			column(name: "esquema_de_pago_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-22") {
		createIndex(indexName: "FK70BA6FED186427E3", tableName: "scheduled_course") {
			column(name: "esquema_de_pago_id")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-23") {
		dropColumn(columnName: "cost_by_course", tableName: "scheduled_course")
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-2") {
		addForeignKeyConstraint(baseColumnNames: "organizacion_id", baseTableName: "concepto", constraintName: "FKDD3FD3073E78BE13", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "organizacion", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-3") {
		addForeignKeyConstraint(baseColumnNames: "scheduled_course_id", baseTableName: "course_session", constraintName: "FKD47ABE72B65882FD", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "scheduled_course", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-4") {
		addForeignKeyConstraint(baseColumnNames: "organizacion_id", baseTableName: "descuento", constraintName: "FK598EC6E83E78BE13", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "organizacion", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-5") {
		addForeignKeyConstraint(baseColumnNames: "concepto_id", baseTableName: "esquema_de_pago", constraintName: "FK8DEE0F7F7DB3FBB3", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "concepto", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-6") {
		addForeignKeyConstraint(baseColumnNames: "recargo_id", baseTableName: "esquema_de_pago", constraintName: "FK8DEE0F7F531802A1", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "recargo", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-7") {
		addForeignKeyConstraint(baseColumnNames: "descuento_id", baseTableName: "esquema_de_pago_descuento", constraintName: "FKC12BBE28F2105881", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "descuento", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-8") {
		addForeignKeyConstraint(baseColumnNames: "esquema_de_pago_descuentos_id", baseTableName: "esquema_de_pago_descuento", constraintName: "FKC12BBE28398B8C97", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "esquema_de_pago", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-9") {
		addForeignKeyConstraint(baseColumnNames: "direccion_id", baseTableName: "organizacion_direccion", constraintName: "FK126F2D95A649AEE2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "direccion", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-10") {
		addForeignKeyConstraint(baseColumnNames: "organizacion_direcciones_id", baseTableName: "organizacion_direccion", constraintName: "FK126F2D955BBE1F94", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "organizacion", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-11") {
		addForeignKeyConstraint(baseColumnNames: "organizacion_telefonos_id", baseTableName: "organizacion_telefono", constraintName: "FKC3169EFD364AC93", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "organizacion", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-12") {
		addForeignKeyConstraint(baseColumnNames: "telefono_id", baseTableName: "organizacion_telefono", constraintName: "FKC3169EFE8FC8D12", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "telefono", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-13") {
		addForeignKeyConstraint(baseColumnNames: "comprobante_de_pago_id", baseTableName: "pago", constraintName: "FK3462993F5C68BA", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "s3asset", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-14") {
		addForeignKeyConstraint(baseColumnNames: "recargo_id", baseTableName: "pago", constraintName: "FK346299531802A1", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "recargo", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-15") {
		addForeignKeyConstraint(baseColumnNames: "descuento_id", baseTableName: "pago_descuento", constraintName: "FKD92078C2F2105881", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "descuento", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-16") {
		addForeignKeyConstraint(baseColumnNames: "pago_descuentos_id", baseTableName: "pago_descuento", constraintName: "FKD92078C258EE329B", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "pago", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-17") {
		addForeignKeyConstraint(baseColumnNames: "pago_id", baseTableName: "payable_pago", constraintName: "FK34215AB63A058EF3", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "pago", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-18") {
		addForeignKeyConstraint(baseColumnNames: "payable_pagos_id", baseTableName: "payable_pago", constraintName: "FK34215AB6D65FEFA6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "payable", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-19") {
		addForeignKeyConstraint(baseColumnNames: "organizacion_id", baseTableName: "recargo", constraintName: "FK4080C1693E78BE13", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "organizacion", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-20") {
		addForeignKeyConstraint(baseColumnNames: "options", baseTableName: "s3asset_options", constraintName: "FKE6010E2F42CEF82A", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "s3asset", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1379464472380-21") {
		addForeignKeyConstraint(baseColumnNames: "esquema_de_pago_id", baseTableName: "scheduled_course", constraintName: "FK70BA6FED186427E3", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "esquema_de_pago", referencesUniqueColumn: "false")
	}
}
