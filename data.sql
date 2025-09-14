-- data.sql
-- 초기 Role 데이터 삽입
INSERT IGNORE INTO roles (name, description) VALUES
  ('ROLE_USER','기본 사용자'),
  ('ROLE_ADMIN','관리자');

-- 필요시 관리자 계정 추가 예시 (비밀번호는 BCrypt 해시로 교체해야 함)
-- INSERT INTO users (email, password_hash, full_name, status, created_at, updated_at)
-- VALUES ('admin@whereclass.me', '{bcrypt_hash_here}', 'Admin', 'ACTIVE', NOW(3), NOW(3));

-- 관리자 계정에 ROLE_ADMIN 부여
-- INSERT INTO user_roles (user_id, role_id)
-- SELECT u.id, r.id FROM users u JOIN roles r ON r.name='ROLE_ADMIN' WHERE u.email='admin@whereclass.me';
