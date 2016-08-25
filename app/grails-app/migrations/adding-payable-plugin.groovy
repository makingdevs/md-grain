databaseChangeLog = {

	changeSet(author: "makingdevs (generated)", id: "1379444256932-1") {
		createTable(tableName: "concepto") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "conceptoPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "date_created", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "descripcion", type: "varchar(150)") {
				constraints(nullable: "false")
			}

			column(name: "last_updated", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "organizacion_id", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-2") {
		createTable(tableName: "descuento") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "descuentoPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "cantidad", type: "decimal(19,2)")

			column(name: "date_created", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "dias_previos_para_cancelar_descuento", type: "integer") {
				constraints(nullable: "false")
			}

			column(name: "fecha_de_vencimiento", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "last_updated", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "nombre_de_descuento", type: "varchar(150)") {
				constraints(nullable: "false")
			}

			column(name: "organizacion_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "porcentaje", type: "decimal(19,2)")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-3") {
		createTable(tableName: "esquema_de_pago") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "esquema_de_paPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "cantidad_de_pago", type: "decimal(19,2)") {
				constraints(nullable: "false")
			}

			column(name: "concepto_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "recargo_id", type: "bigint")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-4") {
		createTable(tableName: "esquema_de_pago_descuento") {
			column(name: "esquema_de_pago_descuentos_id", type: "bigint")

			column(name: "descuento_id", type: "bigint")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-5") {
		createTable(tableName: "organizacion") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "organizacionPK")
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

			column(name: "nombre", type: "varchar(100)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-6") {
		createTable(tableName: "organizacion_direccion") {
			column(name: "organizacion_direcciones_id", type: "bigint")

			column(name: "direccion_id", type: "bigint")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-7") {
		createTable(tableName: "organizacion_telefono") {
			column(name: "organizacion_telefonos_id", type: "bigint")

			column(name: "telefono_id", type: "bigint")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-8") {
		createTable(tableName: "pago") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "pagoPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "cantidad_de_pago", type: "decimal(19,2)") {
				constraints(nullable: "false")
			}

			column(name: "comprobante_de_pago_id", type: "bigint")

			column(name: "concepto_de_pago", type: "varchar(100)") {
				constraints(nullable: "false")
			}

			column(name: "date_created", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "descuento_aplicable", type: "decimal(19,2)") {
				constraints(nullable: "false")
			}

			column(name: "estatus_de_pago", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "fecha_de_pago", type: "datetime")

			column(name: "fecha_de_vencimiento", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "last_updated", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "recargo_id", type: "bigint")

			column(name: "recargos_acumulados", type: "decimal(19,2)") {
				constraints(nullable: "false")
			}

			column(name: "tipo_de_pago", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "transaction_id", type: "varchar(20)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-9") {
		createTable(tableName: "pago_descuento") {
			column(name: "pago_descuentos_id", type: "bigint")

			column(name: "descuento_id", type: "bigint")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-10") {
		createTable(tableName: "payable") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "payablePK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-11") {
		createTable(tableName: "payable_pago") {
			column(name: "payable_pagos_id", type: "bigint")

			column(name: "pago_id", type: "bigint")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-12") {
		createTable(tableName: "recargo") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "recargoPK")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "cantidad", type: "decimal(19,2)")

			column(name: "date_created", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "last_updated", type: "datetime") {
				constraints(nullable: "false")
			}

			column(name: "organizacion_id", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "porcentaje", type: "decimal(19,2)")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-13") {
		createTable(tableName: "s3asset") {
			column(autoIncrement: "true", name: "id", type: "bigint") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "s3assetPK")
			}

			column(name: "bucket", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "bytes_per_second", type: "bigint")

			column(name: "bytes_transfered", type: "bigint")

			column(name: "description", type: "varchar(255)")

			column(name: "host_name", type: "varchar(255)")

			column(name: "aws_key", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "last_modified", type: "bigint")

			column(name: "length", type: "bigint")

			column(name: "local_path", type: "varchar(255)")

			column(name: "local_url", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "mime_type", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "percent_transferred", type: "double precision")

			column(name: "protocol", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "aws_status", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "title", type: "varchar(255)")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-14") {
		createTable(tableName: "s3asset_options") {
			column(name: "options", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "options_idx", type: "varchar(50)") {
				constraints(nullable: "false")
			}

			column(name: "version", type: "bigint") {
				constraints(nullable: "false")
			}

			column(name: "options_elt", type: "varchar(200)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-15") {
		addPrimaryKey(columnNames: "options, options_idx", constraintName: "s3asset_optioPK", tableName: "s3asset_options")
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-34") {
		createIndex(indexName: "FKDD3FD3073E78BE13", tableName: "concepto") {
			column(name: "organizacion_id")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-35") {
		createIndex(indexName: "FK598EC6E83E78BE13", tableName: "descuento") {
			column(name: "organizacion_id")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-36") {
		createIndex(indexName: "FK8DEE0F7F531802A1", tableName: "esquema_de_pago") {
			column(name: "recargo_id")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-37") {
		createIndex(indexName: "FK8DEE0F7F7DB3FBB3", tableName: "esquema_de_pago") {
			column(name: "concepto_id")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-38") {
		createIndex(indexName: "FKC12BBE28398B8C97", tableName: "esquema_de_pago_descuento") {
			column(name: "esquema_de_pago_descuentos_id")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-39") {
		createIndex(indexName: "FKC12BBE28F2105881", tableName: "esquema_de_pago_descuento") {
			column(name: "descuento_id")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-40") {
		createIndex(indexName: "FK126F2D955BBE1F94", tableName: "organizacion_direccion") {
			column(name: "organizacion_direcciones_id")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-41") {
		createIndex(indexName: "FK126F2D95A649AEE2", tableName: "organizacion_direccion") {
			column(name: "direccion_id")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-42") {
		createIndex(indexName: "FKC3169EFD364AC93", tableName: "organizacion_telefono") {
			column(name: "organizacion_telefonos_id")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-43") {
		createIndex(indexName: "FKC3169EFE8FC8D12", tableName: "organizacion_telefono") {
			column(name: "telefono_id")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-44") {
		createIndex(indexName: "FK3462993F5C68BA", tableName: "pago") {
			column(name: "comprobante_de_pago_id")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-45") {
		createIndex(indexName: "FK346299531802A1", tableName: "pago") {
			column(name: "recargo_id")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-46") {
		createIndex(indexName: "FKD92078C258EE329B", tableName: "pago_descuento") {
			column(name: "pago_descuentos_id")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-47") {
		createIndex(indexName: "FKD92078C2F2105881", tableName: "pago_descuento") {
			column(name: "descuento_id")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-48") {
		createIndex(indexName: "FK34215AB63A058EF3", tableName: "payable_pago") {
			column(name: "pago_id")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-49") {
		createIndex(indexName: "FK34215AB6D65FEFA6", tableName: "payable_pago") {
			column(name: "payable_pagos_id")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-50") {
		createIndex(indexName: "FK4080C1693E78BE13", tableName: "recargo") {
			column(name: "organizacion_id")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-51") {
		createIndex(indexName: "idx_asset_status", tableName: "s3asset") {
			column(name: "aws_status")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-52") {
		createIndex(indexName: "FKE6010E2F42CEF82A", tableName: "s3asset_options") {
			column(name: "options")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-53") {
		createIndex(indexName: "option_name_idx", tableName: "s3asset_options") {
			column(name: "options_idx")
		}
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-16") {
		addForeignKeyConstraint(baseColumnNames: "organizacion_id", baseTableName: "concepto", constraintName: "FKDD3FD3073E78BE13", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "organizacion", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-17") {
		addForeignKeyConstraint(baseColumnNames: "organizacion_id", baseTableName: "descuento", constraintName: "FK598EC6E83E78BE13", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "organizacion", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-18") {
		addForeignKeyConstraint(baseColumnNames: "concepto_id", baseTableName: "esquema_de_pago", constraintName: "FK8DEE0F7F7DB3FBB3", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "concepto", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-19") {
		addForeignKeyConstraint(baseColumnNames: "recargo_id", baseTableName: "esquema_de_pago", constraintName: "FK8DEE0F7F531802A1", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "recargo", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-20") {
		addForeignKeyConstraint(baseColumnNames: "descuento_id", baseTableName: "esquema_de_pago_descuento", constraintName: "FKC12BBE28F2105881", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "descuento", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-21") {
		addForeignKeyConstraint(baseColumnNames: "esquema_de_pago_descuentos_id", baseTableName: "esquema_de_pago_descuento", constraintName: "FKC12BBE28398B8C97", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "esquema_de_pago", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-22") {
		addForeignKeyConstraint(baseColumnNames: "direccion_id", baseTableName: "organizacion_direccion", constraintName: "FK126F2D95A649AEE2", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "direccion", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-23") {
		addForeignKeyConstraint(baseColumnNames: "organizacion_direcciones_id", baseTableName: "organizacion_direccion", constraintName: "FK126F2D955BBE1F94", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "organizacion", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-24") {
		addForeignKeyConstraint(baseColumnNames: "organizacion_telefonos_id", baseTableName: "organizacion_telefono", constraintName: "FKC3169EFD364AC93", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "organizacion", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-25") {
		addForeignKeyConstraint(baseColumnNames: "telefono_id", baseTableName: "organizacion_telefono", constraintName: "FKC3169EFE8FC8D12", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "telefono", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-26") {
		addForeignKeyConstraint(baseColumnNames: "comprobante_de_pago_id", baseTableName: "pago", constraintName: "FK3462993F5C68BA", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "s3asset", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-27") {
		addForeignKeyConstraint(baseColumnNames: "recargo_id", baseTableName: "pago", constraintName: "FK346299531802A1", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "recargo", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-28") {
		addForeignKeyConstraint(baseColumnNames: "descuento_id", baseTableName: "pago_descuento", constraintName: "FKD92078C2F2105881", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "descuento", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-29") {
		addForeignKeyConstraint(baseColumnNames: "pago_descuentos_id", baseTableName: "pago_descuento", constraintName: "FKD92078C258EE329B", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "pago", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-30") {
		addForeignKeyConstraint(baseColumnNames: "pago_id", baseTableName: "payable_pago", constraintName: "FK34215AB63A058EF3", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "pago", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-31") {
		addForeignKeyConstraint(baseColumnNames: "payable_pagos_id", baseTableName: "payable_pago", constraintName: "FK34215AB6D65FEFA6", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "payable", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-32") {
		addForeignKeyConstraint(baseColumnNames: "organizacion_id", baseTableName: "recargo", constraintName: "FK4080C1693E78BE13", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "organizacion", referencesUniqueColumn: "false")
	}

	changeSet(author: "makingdevs (generated)", id: "1379444256932-33") {
		addForeignKeyConstraint(baseColumnNames: "options", baseTableName: "s3asset_options", constraintName: "FKE6010E2F42CEF82A", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "s3asset", referencesUniqueColumn: "false")
	}
}
