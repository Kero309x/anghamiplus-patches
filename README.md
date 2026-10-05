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
> **[v1.2.0](https://github.com/Kero309x/anghamiplus-patches/releases/tag/v1.2.0)**&nbsp;&nbsp;•&nbsp;&nbsp;`main`&nbsp;&nbsp;•&nbsp;&nbsp;17 patches total
<details open>
<summary>📦 Anghami&nbsp;&nbsp;•&nbsp;&nbsp;17 patches</summary>
<br>

**🎯 Supported versions:**

| 8.0.28 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [Allow Screenshots](#allow-screenshots) | Bypasses secure window restrictions to allow screenshots and screen recording across the app. |  |
| [Block Audio Ads](#block-audio-ads) | Prevents audio advertisements between songs and treats playback tracks as ad-free. |  |
| [Block Promotional Popups](#block-promotional-popups) | Blocks startup popup offers, promotional flyers, and marketing dialogs. |  |
| [Disable Analytics & Crash Logging](#disable-analytics-crash-logging) | Disables third-party trackers (Braze, Adjust, Firebase, Google, Bugsnag), in-house Silo tracking, and listening telemetry. |  |
| [Disable Forced Shuffle](#disable-forced-shuffle) | Disables forced shuffle mode on playlists and radio, enabling full on-demand song selection. |  |
| [Disable In-App Rating](#disable-in-app-rating) | Disables the in-app review dialogs and 'Love us? Rate us!' rating prompts. |  |
| [Expand Download Limits](#expand-download-limits) | Removes local offline storage caps and disables limited-plan quota checks. |  |
| [Hide Gold Upsell](#hide-gold-upsell) | Hides Gold-tier promotional sections and unsupported server-gated features. |  |
| [Hide Premium Feature Buttons](#hide-premium-feature-buttons) | Hides locked upsell buttons including Sing Along (Karaoke) and AI Mix triggers. |  |
| [Hide Shuffle Badges](#hide-shuffle-badges) | Hides 'Plays in shuffle' badges from playlists, album headers, and feed rows. |  |
| [Hide Upgrade Banners](#hide-upgrade-banners) | Hides navigation upgrade tab, header promo banners, and feed subscription upsell cards. |  |
| [Remove Sponsored Content](#remove-sponsored-content) | Hides sponsored cards, recommended promotions in Car Mode, and radar sponsored content. |  |
| [Show Profile Plus Badge](#show-profile-plus-badge) | Displays the official Plus badge on your profile header and account settings. |  |
| [Spoof App Signature](#spoof-app-signature) | Emulates official application signature headers to preserve API authorization compatibility. |  |
| [Unlimited Track Skips](#unlimited-track-skips) | Removes song skip limitations and queue navigation restrictions. |  |
| [Unlock Full Lyrics](#unlock-full-lyrics) | Enables full synced lyrics display and removes paywall banners on song lyrics. |  |
| [Unlock Plus Experience](#unlock-plus-experience) | Enables client-side Plus features, eliminates free-tier playback restrictions, and enables offline UI mode. |  |

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
