# Contributing to Anghami Plus Patches

Thank you for your interest in contributing to **Anghami Plus Patches**! Contributions from the community help maintain compatibility, expand patch capabilities, and improve user experience.

Please take a moment to review this document before submitting issues or pull requests.

---

## 📌 Code of Conduct & Principles

* **Respect & Civility**: Treat all maintainers, contributors, and users with respect.
* **Safety & Integrity**: All patches must focus strictly on client-side UI optimization, local feature enhancements, audio controls, and privacy/anti-telemetry. Do not submit exploits or tools intended for server-side abuse.
* **Compatibility First**: Any bytecode modification must be verified against the official target version (**Anghami v8.0.28**).

---

## 🚀 Development Setup

### Prerequisites

* **JDK 17 or 21** (Java Development Kit)
* **Android SDK** (Command-line tools or Android Studio)
* **Git** installed and configured

### Building the Patches

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Kero309x/anghamiplus-patches.git
   cd anghamiplus-patches
   ```

2. **Check out the development branch:**
   ```bash
   git checkout dev
   ```

3. **Build patch bundle:**
   ```bash
   ./gradlew build
   ```

4. **Generate patch list documentation:**
   ```bash
   ./gradlew generatePatchesList
   ```

---

## 🌿 Branching Strategy

* **`main`**: Production release branch. Merged only when a release is ready to deploy.
* **`dev`**: Active development branch. All pull requests and ongoing work must target `dev`.
* **Automated Sync**: When changes land on `dev`, automated workflows will create a pre-release and open a tracking PR to `main`.

---

## 💬 Commit Message Convention

This repository strictly enforces [Conventional Commits](https://www.conventionalcommits.org/) to power automated changelog generation and semantic releases:

* `feat: ...` — New patch or user-facing capability (triggers minor version bump).
* `fix: ...` — Bug fix or fingerprint correction (triggers patch version bump).
* `docs: ...` — Documentation updates and README revisions.
* `refactor: ...` — Code cleanup without behavior change.
* `chore: ...` — Maintenance tasks, dependency bumps, or tooling adjustments.

---

## 🛠️ Creating New Patches

When introducing a new patch:

1. **Define Fingerprints**: Place fingerprint objects in `patches/src/main/kotlin/app/anghami/patches/plus/` or `privacy/`. Ensure strict opcode filters and exact method descriptors.
2. **Implement BytecodePatch**: Use `bytecodePatch` DSL with clear `name`, `description`, `compatibleWith(COMPATIBILITY_ANGHAMI_8_0_28)`, and explicit execute instructions.
3. **Verify Locally**: Test patch compilation and ensure zero bytecode regression.
4. **Update README.md**: Add the patch and its description to the catalog table.

---

## 📮 Submitting a Pull Request

1. Fork the repository and create your feature branch from `dev`.
2. Follow code formatting and commit conventions.
3. Open a Pull Request targeting the `dev` branch.
4. Ensure CI checks pass on your PR.
