databaseChangeLog = {

	changeSet(author: "neodevelop (generated)", id: "1380819798920-1") {
		sql("set storage_engine=InnoDB;")
		createTable(tableName: "descuento_aplicable") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "descuento_aplPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "date_created", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "descuento_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "descuento_aplicable_status", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "fecha_de_expiracion", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "last_updated", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "pago_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
		sql("""
			insert into descuento_aplicable(version,date_created,last_updated,
				descuento_id,pago_id,descuento_aplicable_status,fecha_de_expiracion)
			  select 
					'0',now(),now(),
					pd.descuento_id,pd.pago_descuentos_id,'VIGENTE',date_sub(
						(select fecha_de_vencimiento from pago where id=pd.pago_descuentos_id),
						interval (select dias_previos_para_cancelar_descuento 
							from descuento 
							where id=pd.descuento_id) day)
				from pago_descuento pd
			""")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-23") {
		dropIndex(indexName: "FKD92078C258EE329B", tableName: "pago_descuento")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-24") {
		dropIndex(indexName: "FKD92078C2F2105881", tableName: "pago_descuento")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-25") {
		createIndex(indexName: "FK6332753A3A058EF3", tableName: "descuento_aplicable") {
			column(name: "pago_id")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-26") {
		createIndex(indexName: "FK6332753AF2105881", tableName: "descuento_aplicable") {
			column(name: "descuento_id")
		}
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-27") {
		dropColumn(columnName: "fecha_de_vencimiento", tableName: "descuento")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-28") {
		dropTable(tableName: "pago_descuento")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-2") {
		addForeignKeyConstraint(baseColumnNames: "organizacion_id", baseTableName: "concepto", constraintName: "FKDD3FD3073E78BE13", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "organizacion", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-3") {
		addForeignKeyConstraint(baseColumnNames: "scheduled_course_id", baseTableName: "course_session", constraintName: "FKD47ABE72B65882FD", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "scheduled_course", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-4") {
		addForeignKeyConstraint(baseColumnNames: "organizacion_id", baseTableName: "descuento", constraintName: "FK598EC6E83E78BE13", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "organizacion", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-5") {
		addForeignKeyConstraint(baseColumnNames: "descuento_id", baseTableName: "descuento_aplicable", constraintName: "FK6332753AF2105881", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "descuento", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-6") {
		addForeignKeyConstraint(baseColumnNames: "pago_id", baseTableName: "descuento_aplicable", constraintName: "FK6332753A3A058EF3", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "pago", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-7") {
		addForeignKeyConstraint(baseColumnNames: "concepto_id", baseTableName: "esquema_de_pago", constraintName: "FK8DEE0F7F7DB3FBB3", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "concepto", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-8") {
		addForeignKeyConstraint(baseColumnNames: "recargo_id", baseTableName: "esquema_de_pago", constraintName: "FK8DEE0F7F531802A1", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "recargo", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-9") {
		addForeignKeyConstraint(baseColumnNames: "descuento_id", baseTableName: "esquema_de_pago_descuento", constraintName: "FKC12BBE28F2105881", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "descuento", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-10") {
		addForeignKeyConstraint(baseColumnNames: "esquema_de_pago_descuentos_id", baseTableName: "esquema_de_pago_descuento", constraintName: "FKC12BBE28398B8C97", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "esquema_de_pago", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-11") {
		addForeignKeyConstraint(baseColumnNames: "direccion_id", baseTableName: "organizacion_direccion", constraintName: "FK126F2D95A649AEE2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "direccion", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-12") {
		addForeignKeyConstraint(baseColumnNames: "organizacion_direcciones_id", baseTableName: "organizacion_direccion", constraintName: "FK126F2D955BBE1F94", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "organizacion", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-13") {
		addForeignKeyConstraint(baseColumnNames: "organizacion_telefonos_id", baseTableName: "organizacion_telefono", constraintName: "FKC3169EFD364AC93", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "organizacion", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-14") {
		addForeignKeyConstraint(baseColumnNames: "telefono_id", baseTableName: "organizacion_telefono", constraintName: "FKC3169EFE8FC8D12", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "telefono", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-15") {
		addForeignKeyConstraint(baseColumnNames: "comprobante_de_pago_id", baseTableName: "pago", constraintName: "FK3462993F5C68BA", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "s3asset", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-16") {
		addForeignKeyConstraint(baseColumnNames: "recargo_id", baseTableName: "pago", constraintName: "FK346299531802A1", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "recargo", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-17") {
		addForeignKeyConstraint(baseColumnNames: "pago_id", baseTableName: "payable_pago", constraintName: "FK34215AB63A058EF3", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "pago", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-18") {
		addForeignKeyConstraint(baseColumnNames: "payable_pagos_id", baseTableName: "payable_pago", constraintName: "FK34215AB6D65FEFA6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "payable", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-19") {
		addForeignKeyConstraint(baseColumnNames: "organizacion_id", baseTableName: "recargo", constraintName: "FK4080C1693E78BE13", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "organizacion", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-20") {
		addForeignKeyConstraint(baseColumnNames: "scheduled_course_id", baseTableName: "registration", constraintName: "FKAF83E8B9B65882FD", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "scheduled_course", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-21") {
		addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "registration", constraintName: "FKAF83E8B99F6FF5B2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "user", referencesUniqueColumn: "false")
	}

	changeSet(author: "neodevelop (generated)", id: "1380819798920-22") {
		addForeignKeyConstraint(baseColumnNames: "options", baseTableName: "s3asset_options", constraintName: "FKE6010E2F42CEF82A", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "s3asset", referencesUniqueColumn: "false")
	}
}
