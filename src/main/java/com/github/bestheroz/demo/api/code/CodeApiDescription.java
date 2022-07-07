package com.github.bestheroz.demo.api.code;

import lombok.experimental.UtilityClass;

@UtilityClass
public class CodeApiDescription {
  public final String GET_ITEMS =
      """
```
SELECT
    `updated_by`,
    `created_by`,
    `created`,
    `available`,
    `display_order`,
    `id`,
    `text`,
    `type`,
    `value`,
    `updated`
FROM
    `code`
```""";

  public final String GET_ITEMS_ORDER_BY =
      """
```
SELECT
    `updated_by`,
    `created_by`,
    `created`,
    `available`,
    `display_order`,
    `id`,
    `text`,
    `type`,
    `value`,
    `updated`
FROM
    `code`
ORDER BY
    `display_order` desc
```""";

  public final String GET_ITEMS_BY_MAP =
      """
```
SELECT
    `updated_by`,
    `created_by`,
    `created`,
    `available`,
    `display_order`,
    `id`,
    `text`,
    `type`,
    `value`,
    `updated`
FROM
    `code`
WHERE
    (
        `type` = 'EXAMPLE'
    )
```""";
  public final String GET_ITEMS_BY_MAP_ORDER_BY =
      """
```
SELECT
    `updated_by`,
    `created_by`,
    `created`,
    `available`,
    `display_order`,
    `id`,
    `text`,
    `type`,
    `value`,
    `updated`
FROM
    `code`
WHERE
    (
        `type` = 'EXAMPLE'
    )
ORDER BY
    `display_order` desc
```""";

  public final String GET_ITEM_BY_ID =
      """
```
SELECT
    `updated_by`,
    `created_by`,
    `created`,
    `available`,
    `display_order`,
    `id`,
    `text`,
    `type`,
    `value`,
    `updated`
FROM
    `code`
WHERE
    (
        `id` = 3
    )
```""";

  public final String GET_ITEM_BY_MAP =
      """
```
SELECT
    `updated_by`,
    `created_by`,
    `created`,
    `available`,
    `display_order`,
    `id`,
    `text`,
    `type`,
    `value`,
    `updated`
FROM
    `code`
WHERE
    (
        `type` = 'EXAMPLE'
        AND `value` = 'E2'
    )
```""";

  public final String GET_TARGET_ITEMS =
      """
```
SELECT
    `type`,
    `value`,
    `text`
FROM
    `code`
```""";

  public final String GET_TARGET_ITEMS_ORDER_BY =
      """
```
SELECT
    `type`,
    `value`,
    `text`,
    `display_order`
FROM
    `code`
ORDER BY
    `display_order` desc
```""";
  public final String GET_TARGET_ITEMS_BY_MAP =
      """
```
SELECT
    `type`,
    `value`,
    `text`,
    `display_order`
FROM
    `code`
WHERE
    (
        `type` = 'EXAMPLE'
    )
```""";

  public final String GET_TARGET_ITEMS_BY_MAP_ORDER_BY =
      """
```
SELECT
    `type`,
    `value`,
    `text`,
    `display_order`
FROM
    `code`
WHERE
    (
        `type` = 'EXAMPLE'
    )
ORDER BY
    `display_order` desc
```""";
  public final String COUNT_ALL = """
```
SELECT
    COUNT(1) AS CNT
FROM
    `code`
```""";
  public final String COUNT_BY_MAP =
      """
```
SELECT
    COUNT(1) AS CNT
FROM
    `code`
WHERE
    (
        `type` = 'EXAMPLE'
    )
```""";
  public final String GET_DISTINCT_ITEMS =
      """
```
SELECT
    DISTINCT `type`, `available`
FROM
    `code`
```""";
  public final String GET_DISTINCT_ITEMS_ORDER_BY =
      """
```SELECT
    DISTINCT `type`, `available`
FROM
    `code`
ORDER BY
    `display_order` desc
```""";
  public final String GET_DISTINCT_ITEMS_BY_MAP =
      """
```
SELECT
    DISTINCT `type`, `available`
FROM
    `code`
WHERE
    (
        `type` = 'EXAMPLE'
    )
```""";
  public final String GET_DISTINCT_ITEMS_BY_MAP_ORDER_BY =
      """
```
SELECT
    DISTINCT `type`, `available`
FROM
    `code`
WHERE
    (
        `type` = 'EXAMPLE'
    )
ORDER BY
    `display_order` desc
```""";
  public final String INSERT =
      """
```
INSERT
INTO
    `code`  (
        `available`, `display_order`, `id`, `text`, `type`, `value`, `CREATED`, `UPDATED`, `CREATED_BY`, `UPDATED_BY`
    )
VALUES
    (false, 20, null, '예제3', 'EXAMPLE', 'E3', NOW(), NOW(), 1004, 1004)
```""";
  public final String INSERT_BATCH =
      """
```
INSERT
INTO
    `code`  (
        `updated_by`, `created_by`, `created`, `available`, `display_order`, `id`, `text`, `type`, `value`, `updated`
    )
VALUES
    (1004, 1004, NOW(), true, 10, null, '샘플5', 'SAMPLE', 'S5', NOW()),
    (1004, 1004, NOW(), true, 11, null, '샘플6', 'SAMPLE', 'S6', NOW()),
    (1004, 1004, NOW(), true, 12, null, '샘플7', 'SAMPLE', 'S7', NOW())
```""";
  public final String UPDATE_BY_ID =
      """
```
UPDATE
    `code`
SET
    `available` = false,
    `display_order` = 20,
    `id` = null,
    `text` = '예제3',
    `type` = 'EXAMPLE',
    `value` = 'E3',
    `UPDATED` = NOW(),
    `UPDATED_BY` = '1004'
WHERE
    (
        `id` = 4
    )
```""";

  public final String UPDATE_BY_MAP =
      """
```
UPDATE
    `code`
SET
    `available` = false,
    `display_order` = 20,
    `id` = null,
    `text` = '예제3',
    `type` = 'EXAMPLE',
    `value` = 'E3',
    `UPDATED` = NOW(),
    `UPDATED_BY` = '1004'
WHERE
    (
        `display_order` = 3
    )
```""";
  public final String UPDATE_MAP_BY_MAP =
      """
```
UPDATE
    `code`
SET
    `text` = '예제3',
    `UPDATED` = NOW(),
    `UPDATED_BY` = '1004'
WHERE
    (
        `display_order` = 3
    )
```""";
  public final String UPDATE_MAP_BY_ID =
      """
```
UPDATE
    `code`
SET
    `text` = '예제3',
    `UPDATED` = NOW(),
    `UPDATED_BY` = '1004'
WHERE
    (
        `id` = 5
    )
```""";
  public final String DELETE_BY_ID =
      """
```
DELETE
FROM
    `code`
WHERE
    (
        `id` = 5
    )
```""";
  public final String DELETE_BY_MAP =
      """
```
DELETE
FROM
    `code`
WHERE
    (
        `display_order` = 3
    )
```""";
}
