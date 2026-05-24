# DB設計

## 必要テーブル
- users
-companies

## 各テーブルカラム
- companies
| カラム名 | 型 | 内容 | 制約 |
| company_id | BIGINT | 企業ID | PK |
| user_id | BIGINT | ユーザーID | NOT NULL |
| company_name | VARCHAR | 企業名 | NOT NULL |
| industry | VARCHAR | 業界 |
| status | VARCHAR | 選考状況 |
| es_deadline | DATE | ES締切日 |
| interview_date | DATE | 面接日程 |
| priority | VARCHAR | 志望度 |
| note | TEXT | メモ |

- users
| user_id | BIGINT | ユーザーID | PK |
| user_name | VARCHAR | ユーザー名 | NOT NULL |
| password | VARCHAR | パスワード | NOT NULL |