INSERT INTO document_type (name, name_rus)
values ('DOCUMENT', 'Документ'),
       ('CONTRACT', 'Договор'),
       ('MTR_SUPPLY_CONTRACT', 'Договор на поставку МТР (включая дополнительные соглашения)'),
       ('SPECIFICATION_TO_THE_MTR_CONTRACT', 'Спецификация к договору МТР'),
       ('INFORMATION_ON_THE_SUPPLIERS_CHAIN_OF_OWNERSHIP', 'Сведения о цепочке собственников Поставщика'),
       ('MTP_INSURANCE_POLICY', 'Полис страхования МТР'),
       ('MTR_PRODUCTION_AND_SHIPMENT_PLAN', 'План изготовления и отгрузки МТР'),
       ('INFORMATION_ON_THE_PROGRESS_OF_PRODUCTION_AND_PREPARATION_FOR_SHIPMENT_OF_MTR,', 'Информация о ходе изготовления и подготовке к отгрузке МТР'),
       ('DESIGN_DOCUMENTS_FOR_THE_SUPPLIER', 'Конструкторская документация (для поставщика)'),
       ('KMD_WORKING_DOCUMENTATION', 'Рабочая документация по КМД'),
       ('ACT_OR_DOCUMENT_ON_KMD_APPROVAL', 'Акт/документ о согласовании КМД'),
       ('ACTS_OF_DETECTED_DEFECTS_OR_PRODUCT_FAILURES_WITHIN_THE_SCOPE_OF_THE_WARRANTY_CASE', 'Акты о выявленных дефектах либо отказах продукции в рамках гарантийного случая'),
       ('ACTS_OF_DEFECTS_OR_PRODUCT_FAILURES_WITHIN_THE_WARRANTY_PERIOD',
        'Акты о выявленных дефектах либо отказах продукции в рамках гарантийного случая(более 2 лет)'),
       ('ACT_OF_INSPECTION_OF_PRODUCT_MANUFACTURING', 'Акт проверки изготовления продукции'),
       ('PROTOCOL_FOR_ACCEPTANCE_TESTS_OF_PRODUCTS', 'Протокол приемо-сдаточных испытаний продукции'),
       ('INFORMING_ABOUT_HAZARDOUS_SUBSTANCES', 'Информирование об опасных веществах'),
       ('NOTIFICATION_OF_CHANGE_OF_SHIPPING_DETAILS', 'Уведомление о смене отгрузочных реквизитов'),
       ('AGREEMENT_ON_THE_SUPPLY_OF_PRODUCTS_IN_ACCOUNT_OF_WHICH_ADVANCE_PAYMENT',
        'Соглашение о поставке продукции, в счет которой уплачен аванс (пр. 6 к договору на поставку МТР)'),
       ('RECONCILIATION_ACT_ON_THE_PART_OF_THE_SUPPLIER', 'Акт сверки со стороны Поставщика'),
       ('RECONCILIATION_ACT_ON_THE_PART_OF_OST', 'Акт сверки со стороны ОСТ'),
       ('CARGO_CUSTOMS_DECLARATION', 'Грузовая таможенная декларация'),
       ('WAYBILL', 'Транспортная накладная'),
       ('SPECIFICATION', 'Спецификация');

INSERT INTO status (name, name_rus)
values  ('NO_VIEWED', 'не просмотрено'),
        ('DRAFT', 'черновик'),
        ('APPROVAL_IN_PROGRESS', 'на согласовании'),
        ('APPROVED', 'согласован'),
        ('VIEWED', 'просмотрено'),
        ('ACTIVE', 'действует'),
        ('PROVIDED', 'предоставлен'),
        ('ACCEPTED', 'принят'),
        ('WORK_IN_PROGRESS', 'в работе'),
        ('DECLINED', 'отклонен'),
        ('REQUIRES_TO_SIGN', 'требуется подписать'),
        ('REQUIRES_A_RESPONSE_SIGNATURE', 'требуется ответная подпись'),
        ('REQUIRES_APPROVAL', 'требует утверждение'),
        ('COMPLETED', 'завершен'),
        ('CLARIFICATION_IS_EXPECTED', 'ожидается уточнение'),
        ('REQUIRES_CANCELLATION', 'требуется аннулирование'),
        ('CANCELLATION_EXPECTED', 'ожидается аннулирование'),
        ('CANCELED', 'аннулирован'),
        ('CONFIRMATION_OF_THE_OPERATOR_IS_EXPECTED', 'ожидается подтверждение оператора'),
        ('RECEIPT_NOTICE_IS_EXPECTED', 'ожидается извещение о получении'),
        ('SIGNATURE_IS_EXPECTED', 'ожидается ответная подпись'),
        ('REQUIRES_CLARIFICATION', 'требует уточнения'),
        ('IN_WORK', 'в работе');


INSERT INTO document_type_status_map (document_type_id, status_id, status_order) VALUES (2, 1, 1);
INSERT INTO document_type_status_map (document_type_id, status_id, status_order) VALUES (2, 2, 2);
INSERT INTO document_type_status_map (document_type_id, status_id, status_order) VALUES (2, 3, 3);
INSERT INTO document_type_status_map (document_type_id, status_id, status_order) VALUES (3, 5, 1);
INSERT INTO document_type_status_map (document_type_id, status_id, status_order) VALUES (3, 6, 2);
INSERT INTO document_type_status_map (document_type_id, status_id, status_order) VALUES (3, 7, 3);