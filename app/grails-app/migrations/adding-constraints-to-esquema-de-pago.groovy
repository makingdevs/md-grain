databaseChangeLog = {

	changeSet(author: "makingdevs (generated)", id: "1379541603667-1") {
		addForeignKeyConstraint(baseColumnNames: "esquema_de_pago_id", baseTableName: "scheduled_course", constraintName: "FK70BA6FED186427E3", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "esquema_de_pago", referencesUniqueColumn: "false")
	}
}
