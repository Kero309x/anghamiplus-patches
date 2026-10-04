<div align="center">

# 🎵 Anghami Plus Patches

**A production-grade, lightweight modification suite for Anghami on Android, built natively for the Morphe ecosystem.**

[![Latest Release](https://img.shields.io/github/v/release/Kero309x/anghamiplus-patches?style=for-the-badge&color=8A2BE2&logo=github)](https://github.com/Kero309x/anghamiplus-patches/releases/latest)
[![Morphe Ecosystem](https://img.shields.io/badge/Morphe-Compatible-00C853?style=for-the-badge&logo=android)](https://morphe.software)
[![Target App](https://img.shields.io/badge/Target-Anghami%208.0.28-FF5722?style=for-the-badge&logo=google-play)](https://play.google.com/store/apps/details?id=com.anghami)
[![Patches Count](https://img.shields.io/badge/Patches-14%20Active-blue?style=for-the-badge)](https://github.com/Kero309x/anghamiplus-patches#--included-patches)
[![License](https://img.shields.io/badge/License-GPL%20v3-0A84FF?style=for-the-badge)](LICENSE)

<br>

[✨ Key Features](#-key-features) • [📲 Installation](#-installation-guide) • [🎯 Compatibility](#-compatibility--specifications) • [💊 Included Patches](#-included-patches) • [❓ FAQ](#-frequently-asked-questions) • [🛠️ Build](#️-build-from-source)

</div>

---

## 📖 Overview

**Anghami Plus Patches** is an advanced reverse-engineered patch collection engineered to transform the official Anghami Android app into a clean, seamless, and premium listening experience.

By neutralizing client-side barriers, intrusive advertising payloads, and background telemetry collectors, this project restores complete listener control over playback queues, real-time synced lyrics, and user interface aesthetics without requiring device root privileges.

---

## ✨ Key Features

| Feature | Description |
| :--- | :--- |
| 🚫 **Ad-Free Streaming** | Completely silences and bypasses mid-track promotional audio commercials and dismisses startup marketing dialogs. |
| 🎤 **Synchronized Full Lyrics** | Unlocks full-screen, real-time synchronized song lyrics and completely removes preview paywall banners. |
| 🔀 **Unrestricted Track Selection** | Completely breaks out of forced shuffle; pick and play any track on-demand from albums, playlists, and search results. |
| ⏭️ **Unlimited Track Skips** | Eliminates hourly skip limits and removes queue navigation barriers. |
| 👑 **Client-Side Plus Status** | Restores the verified Plus badge on profile headers, unlocks Plus UI states, and activates the client-side Plus experience. |
| 🧹 **Decluttered Interface** | Strips away aggressive subscription upgrade tabs, header promo flyers, Gold upsells, and locked promotional cards. |
| 🛡️ **Privacy & Anti-Telemetry** | Neutrals internal analytics trackers (Anghami Silo), third-party tracking SDKs (Adjust/Branch), and Bugsnag crash logging. |
| 📦 **Extended Local Quotas** | Eliminates local storage restrictions and quota locks for offline song management. |

---

## 🎯 Compatibility & Specifications

| Property | Details |
| :--- | :--- |
| **Package Name** | `com.anghami` |
| **Target Version** | **8.0.28** (Version Code: `8000280`) |
| **Supported Architectures** | `arm64-v8a`, `armeabi-v7a`, `x86`, `x86_64` |
| **Required Permissions / Root** | **No Root Required** (Works on standard non-root and rooted Android devices) |
| **Minimum Android OS** | Android 8.0 (Oreo) and above |

---

## 📲 Installation Guide

### Method 1: One-Click Morphe Manager (Recommended)

1. Ensure **Morphe Manager** is installed on your Android device.
2. Tap the direct button below from your phone to automatically register this repository as an active patch source:

<div align="center">

👉 **[Add to Morphe Manager](https://morphe.software/add-source?github=Kero309x/anghamiplus-patches)** 👈

</div>

3. Download the official **Anghami v8.0.28 APK** (available from trusted sources like APKMirror).
4. In Morphe Manager, select the Anghami APK, choose your preferred patches (all selected by default), and tap **Patch**.
5. Install the generated APK and enjoy!

### Method 2: Manual Source Configuration

1. Launch **Morphe Manager**.
2. Navigate to **Settings** ⚙️ ➔ **Sources**.
3. Tap **Add Source** and input:
   * **Source Name**: `Anghami Plus Patches`
   * **Repository**: `Kero309x/anghamiplus-patches`
4. Return to the Dashboard, select **Anghami (v8.0.28)**, apply patches, and install.

---

## 💊 Included Patches

<!-- PATCHES_START EXPANDED -->
> **[v1.1.0](https://github.com/Kero309x/anghamiplus-patches/releases/tag/v1.1.0)**&nbsp;&nbsp;•&nbsp;&nbsp;`main`&nbsp;&nbsp;•&nbsp;&nbsp;14 patches total
<details open>
<summary>📦 Anghami Patches Suite (14 patches)</summary>
<br>

| 💊 Patch | 📜 Description |
| :--- | :--- |
| **Block Audio Ads** | Blocks promotional audio ads between songs and marks tracks as ad-free. |
| **Block Promotional Popups** | Silences launch promotional modals, sale flyers, and marketing prompts. |
| **Hide Upgrade Banners** | Removes subscribe tabs, feed upsell cards, and promo banners across the app. |
| **Hide Gold Upsell** | Cleans up unsupported Gold-tier promotional sections and locked modules. |
| **Hide Shuffle Badges** | Removes "Plays in shuffle" badges from playlist headers, albums, and cards. |
| **Hide Premium Feature Buttons** | Hides locked premium-exclusive buttons such as AI Mix and Karaoke triggers. |
| **Disable Forced Shuffle** | Unlocks direct track selection and disables mandatory shuffle playback. |
| **Unlock Plus Experience** | Sets Account instance plan to Plus and unlocks local Plus features and UI. |
| **Unlock Full Lyrics** | Unlocks complete synchronized song lyrics view and removes paywall banners. |
| **Unlimited Track Skips** | Eliminates song skip counters and queue navigation barriers. |
| **Expand Download Limits** | Removes local offline storage caps and disables limited-plan quota gates. |
| **Show Profile Plus Badge** | Displays the official Plus badge on your profile header and account settings. |
| **Disable Analytics & Crash Logging** | Blocks third-party telemetry, Anghami Silo activity logs, and Bugsnag reports. |
| **Spoof App Signature** | Spoofs authentic signature headers to ensure uninterrupted backend API access. |

</details>
<!-- PATCHES_END -->

---

## ❓ Frequently Asked Questions

<details>
<summary><b>Does this require Root access?</b></summary>
<p>No. Morphe patches modify the APK package directly. You can install and use the patched app on any unrooted or rooted Android device.</p>
</details>

<details>
<summary><b>Can I download songs for offline playback?</b></summary>
<p>Local client limits and quota verifications are fully removed. However, server-side encrypted media streaming (DRM license issuance) is enforced on Anghami's backend servers. This patch unlocks all client-side download workflows without bypassing server entitlement checks.</p>
</details>

<details>
<summary><b>Will my existing playlists and account data remain safe?</b></summary>
<p>Yes. You log into your own regular Anghami account. Your personal playlists, followed artists, and listening history sync normally.</p>
</details>

<details>
<summary><b>How do I update to newer patch releases?</b></summary>
<p>Morphe Manager will automatically detect new releases published to this repository. When an update is released, simply open Morphe Manager and repatch the APK.</p>
</details>

---

## 🛠️ Build from Source

### Prerequisites
* **Java Development Kit (JDK) 21** or higher.
* **Git** installed on your system.
* A GitHub Personal Access Token (PAT) with `read:packages` permission (required to pull Morphe Gradle plugins).

### Building the `.mpp` Bundle

```bash
# Clone the repository
git clone https://github.com/Kero309x/anghamiplus-patches.git
cd anghamiplus-patches

# Build the Android Morphe patch bundle
./gradlew :patches:buildAndroid
```

The compiled patch artifact will be generated at:
```text
patches/build/libs/patches-1.1.0.mpp
```

---

## 👥 Contributors

* **[Kero309x](https://github.com/Kero309x)** — Project Creator, Lead Reverse Engineer & Maintainer
* **Gemini (Google DeepMind)** — AI Architecture, Bytecode Analysis & Pair Programming

---

## ⚠️ Disclaimer

This open-source project is developed solely for educational, research, and personal customization purposes under fair use. It is not affiliated with, sponsored by, or endorsed by Anghami. All trademarks, service marks, and company names are the property of their respective owners. Server-side protections, DRM systems, and proprietary server assets remain intact and under the sole management of Anghami servers.

---

## 📜 License

This project is licensed under the **GNU General Public License v3.0** — see the [LICENSE](LICENSE) file for complete details.
